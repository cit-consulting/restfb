/**
 * Copyright (c) 2010-2020 Mark Allen, Norbert Bartels.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.restfb.types.whatsapp;

import java.util.Date;

import com.restfb.Facebook;
import com.restfb.types.NamedFacebookType;

import lombok.Getter;
import lombok.Setter;

/**
 * Represents the <a href="https://developers.facebook.com/docs/graph-api/reference/whats-app-business-hsm/">WhatsApp
 * Message Template type </a>
 */
public class WhatsAppMessageTemplate extends NamedFacebookType {

  private static final long serialVersionUID = 1L;

  /**
   * The category type of the message template
   */
  @Getter
  @Setter
  @Facebook
  private String category;

  // WhatsAppBusinessHSMWhatsAppHSMComponentGet is not defined in the reference
  // @Getter
  // @Setter
  // @Facebook
  // private List<WhatsAppBusinessHSMWhatsAppHSMComponentGet> components;

  /**
   * The language (and locale) of the element translation
   */
  @Getter
  @Setter
  @Facebook
  private String language;

  /**
   * The timestamp indicating the last time the message template was updated
   */
  @Getter
  @Setter
  @Facebook("last_updated_time")
  private Date lastUpdatedTime;

  /**
   * The reason the message template was rejected
   */
  @Getter
  @Setter
  @Facebook("rejected_reason")
  private String rejectedReason;

  /**
   * The status of the message template
   */
  @Getter
  @Setter
  @Facebook
  private String status;
}
