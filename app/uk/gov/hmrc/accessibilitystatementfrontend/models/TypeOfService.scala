/*
 * Copyright 2022 HM Revenue & Customs
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

package uk.gov.hmrc.accessibilitystatementfrontend.models

sealed trait TypeOfService extends EnumValue

object TypeOfService extends Enum[TypeOfService] {
  def description: String        = "service type"
  def values: Seq[TypeOfService] = Seq(ClassicServicesType, LiveServicesType, PublicBetaType)
}

case object ClassicServicesType extends TypeOfService {
  val value = "Classic Services"
}

case object LiveServicesType extends TypeOfService {
  val value = "Live services"
}

case object PublicBetaType extends TypeOfService {
  val value = "Public beta"
}
