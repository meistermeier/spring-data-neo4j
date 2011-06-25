/**
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.data.graph.neo4j.support.query;

/**
 * @author mh
 * @since 22.06.11
 */
public interface QueryResultConverter {
    <T> T convertValue(Object value, Class<T> type);

    QueryResultConverter NO_OP_QUERY_RESULT_CONVERTER = new QueryResultConverter() {
        @Override
        public <T> T convertValue(Object value, Class<T> type) {
            return (T) value;
        }
    };
}
