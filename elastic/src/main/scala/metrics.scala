//: ----------------------------------------------------------------------------
//: Copyright (C) 2015 Verizon.  All Rights Reserved.
//:
//:   Licensed under the Apache License, Version 2.0 (the "License");
//:   you may not use this file except in compliance with the License.
//:   You may obtain a copy of the License at
//:
//:       http://www.apache.org/licenses/LICENSE-2.0
//:
//:   Unless required by applicable law or agreed to in writing, software
//:   distributed under the License is distributed on an "AS IS" BASIS,
//:   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//:   See the License for the specific language governing permissions and
//:   limitations under the License.
//:
//: ----------------------------------------------------------------------------
package funnel
package elastic

//Needed for static initialization of JVM Metrics
import scala.concurrent.duration._

class ElasticMetrics(i: Instruments) {
  val DroppedDocErrors = i.counter("elastic/errors/dropped")
  val NonHttpErrors    = i.counter("elastic/errors/other")
  val HttpResponse5xx  = i.counter("elastic/http/5xx")
  val HttpResponse4xx  = i.counter("elastic/http/4xx")
  val HttpResponse2xx  = i.lapTimer("elastic/http/2xx")
  val BufferDropped    = i.counter("elastic/queue/dropped")
  val BufferUsed       = i.numericGauge("elastic/buffer/pending", 0)
}
