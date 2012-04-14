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
package com.ning.billing.jaxrs.resources;

public interface BaseJaxrsResource {
	
	public static final String API_PREFIX = "";
	public static final String API_VERSION = "/1.0";
	
	/*
	 * Patterns
	 */
	public static String UUID_PATTERN = "\\w+-\\w+-\\w+-\\w+-\\w+";
	
	/*
	 * Query parameters
	 */
	public static final String QUERY_EXTERNAL_KEY = "external_key";
	public static final String QUERY_REQUESTED_DT = "requested_date";
	public static final String QUERY_CALL_COMPLETION = "call_completion";
	public static final String QUERY_CALL_TIMEOUT = "call_timeout_sec";	
	
	public static final String ACCOUNTS = "accounts";	
	public static final String ACCOUNTS_PATH = API_PREFIX + API_VERSION + "/" + ACCOUNTS;
	
	public static final String BUNDLES = "bundles";		
	public static final String BUNDLES_PATH = API_PREFIX + API_VERSION + "/" + BUNDLES;

	public static final String SUBSCRIPTIONS = "subscriptions";		
	public static final String SUBSCRIPTIONS_PATH = API_PREFIX + API_VERSION + "/" + SUBSCRIPTIONS;

}
