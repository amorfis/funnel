package funnel
package flask

import funnel.elastic.ElasticCfg
import scala.concurrent.duration._

case class RiemannCfg(
  host: String,
  port: Int,
  ttl: Duration
)

case class Options(
  name: Option[String],
  cluster: Option[String],
  elastic: Option[ElasticCfg] = None,
  riemann: Option[RiemannCfg] = None,
  funnelPort: Int = 5775,
  metricTTL: Option[Duration] = None,
  telemetryPort: Int = 7390
)
