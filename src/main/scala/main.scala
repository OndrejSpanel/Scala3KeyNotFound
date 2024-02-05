import wvlet.airframe.surface.*

class InjectScript(x: Seq[MethodSurface])

class XParams[+T](params: Map[String, T])

object InjectScript {
  trait Params {
    def getParams: XParams[Unit]
  }

  class ScriptX extends InjectScript(Surface.methodsOf[Params])
}
