/*
 * Copyright 2019 Emil Suleymanov
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
 */

package sssemil.com.bridge.net.stack

import kotlinx.coroutines.CoroutineScope
import net.floodlightcontroller.packet.IPacket
import sssemil.com.bridge.ess.EssClientHandle
import sssemil.com.bridge.util.Logger

class LoggerProtocol(scope: CoroutineScope, val tag: String? = null) : Protocol(scope) {

    override fun swallowFromAbove(handle: EssClientHandle, packet: IPacket) {
        Logger.d("${tag ?: "LOG"} from above: $packet")
    }

    override fun swallowFromBelow(handle: EssClientHandle, packet: IPacket) {
        Logger.d("${tag ?: "LOG"} from below: $packet")
    }
}