/*
 * Copyright (C) 2012 The Android Open Source Project
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

package androidx.renderscript;

/**
 * Base class for all Intrinsic scripts. An intrinsic a script
 * which implements a pre-defined function. Intrinsics are
 * provided to provide effecient implemtations of common
 * operations.
 *
 * Not intended for direct use.
 **/
public abstract class ScriptIntrinsic extends Script {
    ScriptIntrinsic(long id, RenderScript rs) {
        super(id, rs);
        if (id == 0) {
            throw new RSRuntimeException("Loading of ScriptIntrinsic failed.");
        }
    }
}
