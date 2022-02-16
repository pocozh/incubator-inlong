/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.inlong.manager.dao.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.inlong.manager.common.pojo.cluster.ClusterRequest;
import org.apache.inlong.manager.dao.entity.ClusterInfoEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClusterInfoMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(ClusterInfoEntity record);

    int insertSelective(ClusterInfoEntity record);

    ClusterInfoEntity selectByPrimaryKey(Integer id);

    List<ClusterInfoEntity> selectByIdList(@Param("idList") List<Integer> idList);

    int updateByPrimaryKeySelective(ClusterInfoEntity record);

    int updateByPrimaryKey(ClusterInfoEntity record);

    List<ClusterInfoEntity> selectByCondition(ClusterRequest request);

    List<ClusterInfoEntity> selectByMqSetName(String mqSetName);

}