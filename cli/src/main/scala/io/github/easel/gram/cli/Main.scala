package io.github.easel.gram.cli

import io.github.easel.gram.api.cli.{Command, Config}

object Main {
  val parser = new scopt.OptionParser[Config]("gram") {
    head("gram", "0.1")

    Command.All.foreach { command =>
      cmd(command.longForm).action((_, c) => c.copy(command = command))
        .text(command.description)

    }
  }

  def main(args: Array[String]):Unit = {
    parser.parse(args, Config()) match {
      case Some(config) =>
        println("do work")

      case None =>
        println("help")
    }
  }
}
