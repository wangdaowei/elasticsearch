/*
 * Licensed to Elasticsearch under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.elasticsearch.client.ml.dataframe.stats.outlierdetection;

import org.elasticsearch.common.xcontent.XContentParser;
import org.elasticsearch.test.AbstractXContentTestCase;

import java.io.IOException;

public class ParametersTests extends AbstractXContentTestCase<Parameters> {

    @Override
    protected boolean supportsUnknownFields() {
        return true;
    }

    @Override
    protected Parameters doParseInstance(XContentParser parser) throws IOException {
        return Parameters.PARSER.apply(parser, null);
    }

    @Override
    protected Parameters createTestInstance() {
        return createRandom();
    }

    public static Parameters createRandom() {
        return new Parameters(
            randomBoolean() ? null : randomIntBetween(1, Integer.MAX_VALUE),
            randomBoolean() ? null : randomAlphaOfLength(5),
            randomBoolean() ? null : randomBoolean(),
            randomBoolean() ? null : randomDouble(),
            randomBoolean() ? null : randomDouble(),
            randomBoolean() ? null : randomBoolean()
        );
    }
}
