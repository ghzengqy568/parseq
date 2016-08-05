
package com.linkedin.restli.examples.greetings.client;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.linkedin.data.schema.validation.ValidationResult;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.BatchPartialUpdateRequestBuilderBase;
import com.linkedin.restli.common.PatchRequest;
import com.linkedin.restli.common.ResourceMethod;
import com.linkedin.restli.common.ResourceSpec;
import com.linkedin.restli.common.validation.RestLiDataValidator;
import com.linkedin.restli.examples.greetings.api.ValidationDemo;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder", date = "Thu Mar 31 14:16:24 PDT 2016")
public class ValidationDemosBatchPartialUpdateBuilder
    extends BatchPartialUpdateRequestBuilderBase<Integer, ValidationDemo, ValidationDemosBatchPartialUpdateBuilder>
{


    public ValidationDemosBatchPartialUpdateBuilder(String baseUriTemplate, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, ValidationDemo.class, resourceSpec, requestOptions);
    }

    public static ValidationResult validateInput(PatchRequest<ValidationDemo> patch) {
        Map<String, List<String>> annotations = new HashMap<String, List<String>>();
        annotations.put("createOnly", Arrays.asList("stringB", "intB", "UnionFieldWithInlineRecord/com.linkedin.restli.examples.greetings.api.myRecord/foo2", "MapWithTyperefs/*/id"));
        annotations.put("readOnly", Arrays.asList("stringA", "intA", "UnionFieldWithInlineRecord/com.linkedin.restli.examples.greetings.api.myRecord/foo1", "ArrayWithInlineRecord/*/bar1", "validationDemoNext/stringB", "validationDemoNext/UnionFieldWithInlineRecord"));
        RestLiDataValidator validator = new RestLiDataValidator(annotations, ValidationDemo.class, ResourceMethod.BATCH_PARTIAL_UPDATE);
        return validator.validateInput(patch);
    }

}