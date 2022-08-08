/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import React from 'react';
import { Button } from 'antd';
import i18n from '@/i18n';
import { timestampFormat } from '@/utils';

export const getFilterFormContent = () => [
  {
    type: 'inputsearch',
    name: 'keyword',
  },
];

export const getColumns = ({ onEdit, onDelete }) => {
  return [
    {
      title: i18n.t('pages.ApprovalManagement.ProcessName'),
      dataIndex: 'processName',
    },
    {
      title: i18n.t('pages.ApprovalManagement.TaskName'),
      dataIndex: 'taskName',
    },
    {
      title: i18n.t('pages.ApprovalManagement.Approvers'),
      dataIndex: 'approvers',
    },
    {
      title: i18n.t('pages.ApprovalManagement.Creator'),
      dataIndex: 'creator',
    },
    {
      title: i18n.t('pages.ApprovalManagement.Modifier'),
      dataIndex: 'modifier',
    },
    {
      title: i18n.t('pages.ApprovalManagement.CreateTime'),
      dataIndex: 'createTime',
      render: text => text && timestampFormat(text),
    },
    {
      title: i18n.t('pages.ApprovalManagement.ModifyTime'),
      dataIndex: 'modifyTime',
      render: text => text && timestampFormat(text),
    },
    {
      title: i18n.t('basic.Operating'),
      dataIndex: 'action',
      render: (text, record) => (
        <>
          <Button type="link" onClick={() => onEdit(record)}>
            {i18n.t('basic.Edit')}
          </Button>
          <Button type="link" onClick={() => onDelete(record)}>
            {i18n.t('basic.Delete')}
          </Button>
        </>
      ),
    },
  ];
};
