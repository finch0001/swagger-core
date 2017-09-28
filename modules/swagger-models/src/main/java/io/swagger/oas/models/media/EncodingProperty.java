/**
 * Copyright 2017 SmartBear Software
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.swagger.oas.models.media;

import io.swagger.oas.models.headers.Header;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * EncodingProperty
 *
 * @see "https://github.com/OAI/OpenAPI-Specification/blob/master/versions/3.0.md#encodingPropertyObject"
 */


public class EncodingProperty {
  private String contentType = null;
  private Map<String, Header> headers = null;
  /**
   * Gets or Sets style
   */
  public enum StyleEnum {
    FORM("form"),
    
    SPACEDELIMITED("spaceDelimited"),
    
    PIPEDELIMITED("pipeDelimited"),
    
    DEEPOBJECT("deepObject");

    private String value;

    StyleEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  private StyleEnum style = null;
  private Boolean explode = null;
  private Boolean allowReserved = null;
  private java.util.Map<String, Object> extensions = null;

  /**
   * returns the contentType property from a EncodingProperty instance.
   *
   * @return String contentType
   **/

  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public EncodingProperty contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * returns the headers property from a EncodingProperty instance.
   *
   * @return headers
   **/

  public Map<String, Header> getHeaders() {
    return headers;
  }

  public void setHeaders(Map<String, Header> headers) {
    this.headers = headers;
  }

  public EncodingProperty headers(Map<String, Header> headers) {
    this.headers = headers;
    return this;
  }

  public EncodingProperty addHeaderObject(String name, Header header) {
    if(this.headers == null) {
      headers = new HashMap<>();
    }
    headers.put(name, header);
    return this;
  }

  /**
   * returns the style property from a EncodingProperty instance.
   *
   * @return StyleEnum style
   **/

  public StyleEnum getStyle() {
    return style;
  }

  public void setStyle(StyleEnum style) {
    this.style = style;
  }

  public EncodingProperty style(StyleEnum style) {
    this.style = style;
    return this;
  }

  /**
   * returns the explode property from a EncodingProperty instance.
   *
   * @return Boolean explode
   **/

  public Boolean getExplode() {
    return explode;
  }

  public void setExplode(Boolean explode) {
    this.explode = explode;
  }

  public EncodingProperty explode(Boolean explode) {
    this.explode = explode;
    return this;
  }

  /**
   * returns the allowReserved property from a EncodingProperty instance.
   *
   * @return Boolean allowReserved
   **/

  public Boolean getAllowReserved() {
    return allowReserved;
  }

  public void setAllowReserved(Boolean allowReserved) {
    this.allowReserved = allowReserved;
  }

  public EncodingProperty allowReserved(Boolean allowReserved) {
    this.allowReserved = allowReserved;
    return this;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EncodingProperty encodingProperty = (EncodingProperty) o;
    return Objects.equals(this.contentType, encodingProperty.contentType) &&
        Objects.equals(this.headers, encodingProperty.headers) &&
        Objects.equals(this.style, encodingProperty.style) &&
        Objects.equals(this.explode, encodingProperty.explode) &&
        Objects.equals(this.allowReserved, encodingProperty.allowReserved) &&
        Objects.equals(this.extensions, encodingProperty.extensions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentType, headers, style, explode, allowReserved, extensions);
  }


  public java.util.Map<String, Object> getExtensions() {
    return extensions;
  }

  public void addExtension(String name, Object value) {
    if (name == null || name.isEmpty() || !name.startsWith("x-")) {
      return;
    }
    if(this.extensions == null) {
      this.extensions = new java.util.HashMap<>();
    }
    this.extensions.put(name, value);
  }

  public void setExtensions(java.util.Map<String, Object> extensions) {
    this.extensions = extensions;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncodingProperty {\n");
    
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    explode: ").append(toIndentedString(explode)).append("\n");
    sb.append("    allowReserved: ").append(toIndentedString(allowReserved)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

