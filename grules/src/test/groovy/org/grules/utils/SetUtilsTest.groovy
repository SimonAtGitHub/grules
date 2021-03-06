package org.grules.utils

import spock.lang.Specification

class SetUtilsTest extends Specification {

  def "nullToEmpty"() {
  setup:
    def set = [] as Set
  expect:
    SetUtils.nullToEmpty(null) != null
    SetUtils.nullToEmpty(set) == set
  }
}
