/**
 * Copyright 2018 The original authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
**/
package io.ap4k.examples.s2i;

import io.ap4k.deps.kubernetes.client.DefaultKubernetesClient;
import io.ap4k.deps.kubernetes.client.KubernetesClient;
import io.ap4k.testing.openshift.OpenshiftExtesnsion;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(OpenshiftExtesnsion.class)
public class SourceToImageExampleIT {

  @Test
  public void shouldRun() {
    KubernetesClient client = new DefaultKubernetesClient();
    client.pods().list().getItems().stream().forEach(p -> System.out.println(p.getMetadata().getName()));
  }
}
