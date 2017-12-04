/***
 *   Copyright 2017 Rackspace US, Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package com.rackspace.com.papi.components.checker.servlet

import javax.servlet.http.HttpServletRequest

import com.rackspace.com.papi.components.checker.servlet.RequestAttributes._
import org.w3c.dom.Document

//
//  This is an empty representation. It essentially represents the
//  fact that a parsed representation does not exist.
//

object ParsedNIL extends ParsedRepresentation {
  type R = Any
  override val representation = null
  override val parameters = List()
  override val sideEffectParams = List()
}
