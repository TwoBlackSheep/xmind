/* ******************************************************************************
 * Copyright (c) 2006-2012 XMind Ltd. and others.
 * 
 * This file is a part of XMind 3. XMind releases 3 and
 * above are dual-licensed under the Eclipse Public License (EPL),
 * which is available at http://www.eclipse.org/legal/epl-v10.html
 * and the GNU Lesser General Public License (LGPL), 
 * which is available at http://www.gnu.org/licenses/lgpl.html
 * See https://www.xmind.net/license.html for details.
 * 
 * Contributors:
 *     XMind Ltd. - initial API and implementation
 *******************************************************************************/

package org.xmind.gef.service;

import java.util.EventObject;
import java.util.List;

import org.xmind.gef.part.IGraphicalPart;

/**
 * @author Frank Shaka
 * 
 */
public class RevealEvent extends EventObject {

    /**
     * 
     */
    private static final long serialVersionUID = 6690604795694135622L;

    private List<IGraphicalPart> partsToReveal;

    /**
     * @param source
     */
    public RevealEvent(Object source, List<IGraphicalPart> partsToReveal) {
        super(source);
        this.partsToReveal = partsToReveal;
    }

    /**
     * @return the partsToReveal
     */
    public List<IGraphicalPart> getPartsToReveal() {
        return partsToReveal;
    }

}
