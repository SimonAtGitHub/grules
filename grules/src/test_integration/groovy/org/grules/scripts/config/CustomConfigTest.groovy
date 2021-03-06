package org.grules.scripts.config

import static org.grules.TestScriptEntities.NOT_VALIDATED_PARAMETERS_ACTION
import static org.grules.TestScriptEntities.CONFIG_LOG_LEVEL

import org.grules.config.GrulesConfigFactory

import spock.lang.Specification

class CustomConfigTest extends Specification {

  def "Custom config read"() {
    setup:
      def config = new GrulesConfigFactory().createConfig(CustomConfig)
    expect:
      config.logLevel == CONFIG_LOG_LEVEL
      config.notValidatedParametersAction == NOT_VALIDATED_PARAMETERS_ACTION
  }

  def "Lasci config is read from recources"() {
    setup:
      def config = new GrulesConfigFactory().createConfig()
    expect:
      config.logLevel == CONFIG_LOG_LEVEL
  }
}
