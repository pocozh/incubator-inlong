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

package org.apache.inlong.agent.plugin.sources.reader;

import org.apache.inlong.agent.conf.JobProfile;
import org.apache.inlong.agent.plugin.Reader;

import static org.apache.inlong.agent.constant.CommonConstants.DEFAULT_PROXY_INLONG_GROUP_ID;
import static org.apache.inlong.agent.constant.CommonConstants.DEFAULT_PROXY_INLONG_STREAM_ID;
import static org.apache.inlong.agent.constant.CommonConstants.PROXY_INLONG_GROUP_ID;
import static org.apache.inlong.agent.constant.CommonConstants.PROXY_INLONG_STREAM_ID;

/**
 * abstract reader, init reader and reader metrics
 */
public abstract class AbstractReader implements Reader {

    protected String inlongGroupId;

    protected String inlongStreamId;
    protected String metricTagName;

    @Override
    public void init(JobProfile jobConf) {
        inlongGroupId = jobConf.get(PROXY_INLONG_GROUP_ID, DEFAULT_PROXY_INLONG_GROUP_ID);
        inlongStreamId = jobConf.get(PROXY_INLONG_STREAM_ID, DEFAULT_PROXY_INLONG_STREAM_ID);
    }

    public String getInlongGroupId() {
        return inlongGroupId;
    }
//    /**
//     * init reader metrics
//     *
//     * @param tagName metric tagName
//     */
//    protected void intMetric(String tagName) {
//        String metricsIndexValue = String.valueOf(metricsIndex.getAndIncrement());
//        String label = Joiner.on(",").join(tagName, metricsIndexValue);
//        String groupIdKV = PROXY_KEY_GROUP_ID + "=" + inlongGroupId;
//        String streamIdKV = PROXY_KEY_STREAM_ID + "=" + inlongStreamId;
//        String metricsIndexKV = KEY_METRICS_INDEX + "=" + metricsIndexValue;
//        if (ConfigUtil.isPrometheusEnabled()) {
//            readerMetric = new PluginPrometheusMetric(label);
//        } else {
//            label = Joiner.on(",").join(tagName, metricsIndexKV);
//            readerMetric = new PluginJmxMetric(label);
//        }
//        label = Joiner.on(",").join(tagName, inlongGroupId, inlongStreamId);
//        if (ConfigUtil.isPrometheusEnabled()) {
//            streamMetric = new PluginPrometheusMetric(label);
//        } else {
//            label = Joiner.on(",").join(tagName, groupIdKV, streamIdKV);
//            streamMetric = new PluginJmxMetric(label);
//        }
//    }

}
