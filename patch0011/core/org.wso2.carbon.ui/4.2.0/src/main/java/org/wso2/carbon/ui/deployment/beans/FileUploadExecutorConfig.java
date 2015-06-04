/*
 * Copyright 2005-2007 WSO2, Inc. (http://wso2.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wso2.carbon.ui.deployment.beans;

import java.util.ArrayList;
import java.util.List;

public class FileUploadExecutorConfig {
    private List<String> mappingActionList;
    private String executorClass;

    public FileUploadExecutorConfig(){
        mappingActionList = new ArrayList<String>();
    }

    public String[] getMappingActionList() {
        String[] mappingActions = new String[mappingActionList.size()];
    	mappingActionList.toArray(mappingActions);
    	return mappingActions;
    }

    public void addMappingAction(String action) {
        this.mappingActionList.add(action);
    }

    public String getFUploadExecClass() {
        return executorClass;
    }

    public void setFUploadExecClass(String executorClass) {
        this.executorClass = executorClass;
    }
}
