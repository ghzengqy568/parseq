
package com.linkedin.restli.examples.greetings.client;

import javax.annotation.Generated;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder", date = "Thu Mar 31 14:16:19 PDT 2016")
public class ActionsDoEchoRequestBuilder
    extends ActionRequestBuilderBase<Void, java.lang.String, ActionsDoEchoRequestBuilder>
{


    public ActionsDoEchoRequestBuilder(java.lang.String baseUriTemplate, Class<java.lang.String> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("echo");
    }

    public ActionsDoEchoRequestBuilder inputParam(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("echo").getFieldDef("input"), value);
        return this;
    }

}
