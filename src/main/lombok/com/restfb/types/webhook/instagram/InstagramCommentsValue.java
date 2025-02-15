/*
 * Copyright (c) 2010-2023 Mark Allen, Norbert Bartels.
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
package com.restfb.types.webhook.instagram;

import com.restfb.Facebook;
import com.restfb.types.instagram.IgFrom;
import com.restfb.types.webhook.ChangeValue;

import lombok.Getter;
import lombok.Setter;

public class InstagramCommentsValue extends ChangeValue {

  @Getter
  @Setter
  @Facebook
  private String id;

  @Getter
  @Setter
  @Facebook
  private IgFrom from;

  @Getter
  @Setter
  @Facebook
  private IgCommentMedia media;

  @Getter
  @Setter
  @Facebook
  private String text;

  @Getter
  @Setter
  @Facebook("parent_id")
  private String parentId;

  public static class IgCommentMedia {

    @Getter
    @Setter
    @Facebook
    private String id;

    @Getter
    @Setter
    @Facebook("media_product_type")
    private String mediaProductType;
  }
}
