/*
 * Copyright (c) 2021 Queensland University of Technology
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */

package com.processdataquality.praeclarus.logging;

import javax.persistence.Entity;

/**
 * @author Michael Adams
 * @date 30/11/21
 */
@Entity
public class ConnectorEvent extends AbstractLogEvent {

    private String source;
    private String target;

    protected ConnectorEvent() { }

    public ConnectorEvent(String user, LogConstant label, String source, String target) {
        super(user, label);
        setSource(source);
        setTarget(target);
    }


    public String getSource() {return source; }

    public void setSource(String source) { this.source = source; }


    public String getTarget() { return target; }

    public void setTarget(String target) { this.target = target; }


    @Override
    public String toString() {
        return super.toString() + "; Source: " + source + ", Target: " + target;
    }
}


