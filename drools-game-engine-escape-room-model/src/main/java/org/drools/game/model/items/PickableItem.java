/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.game.model.items;

import org.drools.game.model.api.Pickable;

public class PickableItem {

    private final Pickable pickable;

    public PickableItem( Pickable pickable ) {
        this.pickable = pickable;
    }

    public Pickable getPickable() {
        return pickable;
    }

    @Override
    public String toString() {
        return "PickableItem{" + "pickable=" + pickable + '}';
    }

}
