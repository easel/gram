package io.github.easel.gram.api.cli

sealed abstract class Command extends Product with Serializable {
  def description: String
  def longForm: String
}
object Command {
  case object ListInternalIpsByInstanceTag extends Command {
    override val description: String = "List internal ip addresses of instances tagged by --tag"
    override val longForm: String = "list-internal-ips-by-instance-tag"
  }

  val All = Seq(ListInternalIpsByInstanceTag)
  require(All.map(_.longForm).distinct.lengthCompare(All.size) == 0)
}
case class Config (command: Option[Command]= None) {
}
