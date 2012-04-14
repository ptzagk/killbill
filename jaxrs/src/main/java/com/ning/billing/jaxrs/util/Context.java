/*
 * Copyright 2010-2011 Ning, Inc.
 *
 * Ning licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package com.ning.billing.jaxrs.util;

import java.util.UUID;

import com.google.inject.Inject;
import com.ning.billing.util.callcontext.CallContext;
import com.ning.billing.util.callcontext.CallContextFactory;
import com.ning.billing.util.callcontext.CallOrigin;
import com.ning.billing.util.callcontext.UserType;

public class Context {

    private final CallOrigin origin;
    private final UserType userType;
    final CallContextFactory contextFactory;

    @Inject
    public Context(final CallContextFactory factory) {
        super();
        this.origin = CallOrigin.EXTERNAL;
        this.userType = UserType.CUSTOMER;
        this.contextFactory = factory;
    }

    // Simplistic until we decide how to populate that
    public CallContext createContext() {
        return contextFactory.createCallContext("Unknown", origin, userType, UUID.randomUUID());
    }
}
