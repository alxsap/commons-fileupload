/*
 * Copyright 2001-2004 The Apache Software Foundation
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
package org.apache.commons.fileupload;

/**
 * Exception for errors encountered while processing the request.
 *
 * @author <a href="mailto:jmcnally@collab.net">John McNally</a>
 * @version $Id: FileUploadException.java,v 1.10 2004/10/29 04:17:23 martinc Exp $
 */
public class FileUploadException
    extends Exception {

    /**
     * Constructs a new <code>FileUploadException</code> without message.
     */
    public FileUploadException() {
    }

    /**
     * Constructs a new <code>FileUploadException</code> with specified detail
     * message.
     *
     * @param msg the error message.
     */
    public FileUploadException(final String msg) {
        super(msg);
    }
}
