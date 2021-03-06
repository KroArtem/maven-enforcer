package org.apache.maven.plugins.enforcer;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.apache.maven.artifact.versioning.ArtifactVersion;
import org.apache.maven.artifact.versioning.DefaultArtifactVersion;
import org.apache.maven.execution.RuntimeInformation;

/**
 * Just a mock object hard coded to return version 2.0.5
 *
 * @author <a href="mailto:brianf@apache.org">Brian Fox</a>
 */
public class MockRuntimeInformation
    implements RuntimeInformation
{

    /*
     * (non-Javadoc)
     *
     * @see org.apache.maven.execution.RuntimeInformation#getApplicationVersion()
     */
    public ArtifactVersion getApplicationVersion()
    {
        return new DefaultArtifactVersion( "2.0.5" );
    }

}
