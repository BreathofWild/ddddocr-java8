/*
 * Copyright © 2022 <a href="mailto:zhang.h.n@foxmail.com">Zhang.H.N</a>.
 *
 * Licensed under the Apache License, Version 2.0 (thie "License");
 * You may not use this file except in compliance with the license.
 * You may obtain a copy of the License at
 *
 *       http://wwww.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language govering permissions and
 * limitations under the License.
 */
package d4ocr.utils;
import ai.onnxruntime.OnnxTensor;

import java.util.HashMap;
import java.util.Map;


public class MapOf {
    public static Map<String, OnnxTensor> of(String k , OnnxTensor v){
        Map<String ,OnnxTensor> map = new HashMap<>();
        map.put(k,v);
        return map;
    }
    public static Map<String, OnnxTensor> of(String k , OnnxTensor v,String k1 , OnnxTensor v1){
        Map<String ,OnnxTensor> map = new HashMap<>();
        map.put(k,v);
        map.put(k1,v1);
        return map;
    }
}