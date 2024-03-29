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
import ai.onnxruntime.OrtEnvironment;
import ai.onnxruntime.OrtSession;

import java.nio.FloatBuffer;

/**
 *  ONNX运行时工具，基于微软开放的onnxruntime
 * @author GCS-ZHN
 */
public class ONNXRuntimeUtils implements AutoCloseable {
    /**ONNX服务的环境 */
    private OrtEnvironment env = OrtEnvironment.getEnvironment();

    public OrtSession createSession(String modelPath) {
        try {
            return env.createSession(modelPath);
        } catch (Exception e) {
            LogUtils.printMessage("创建ONNX模型失败", e, LogUtils.Level.ERROR);
            return null;
        }
        
    }

    /**
     * 创建单精度浮点数张量
     * @param data 浮点缓存数据
     * @param shape 张量形状
     * @return 创建的ONNX张量
     */
    public OnnxTensor createTensor(FloatBuffer data, long[] shape) {
        try {
            return OnnxTensor.createTensor(env, data, shape);
        } catch (Exception e) {
            LogUtils.printMessage("创建张量失败", e, LogUtils.Level.ERROR);
            return null;
        }
    }

    /**
     * 创建单精度浮点数张量
     * @param data 浮点数组
     * @param shape 张量形状
     * @return 创建的ONNX张量
     */
    public OnnxTensor createTensor(float[] data, long[] shape) {
        return createTensor(FloatBuffer.wrap(data), shape);
    }

    /**
     * 关闭ONNX服务
     */
    @Override
    public void close() throws Exception {
        env.close();
    }
}
