/*
 * Copyright (c) 2017 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.opendaylight.mdsal.binding.javav2.generator.impl.list.action.examples;

import org.opendaylight.mdsal.binding.javav2.spec.base.Input;
import org.opendaylight.mdsal.binding.javav2.spec.base.Instantiable;
import org.opendaylight.mdsal.binding.javav2.spec.base.TreeNode;

/**
 * action list-action-call input
 */
public interface ListActionCallInput extends Input<ListActionCallInput>, Instantiable<ListActionCallInput>, TreeNode {

    @Override
    Class<ListActionCallInput> implementedInterface();

    String getV1();
}
