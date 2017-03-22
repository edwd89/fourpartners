/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package com.charpixel.baseandroidproject.common;

import rx.Observable;

public abstract class UsecaseBase<T> {

    public abstract Observable<T> buildObservable();

    public Observable<T> execute() {
        return buildObservable();
    }

}
