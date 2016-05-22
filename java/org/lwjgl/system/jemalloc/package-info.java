/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */

/**
 * Contains bindings to the <a href="http://www.canonware.com/jemalloc/">jemalloc</a> library. jemalloc is a general purpose malloc implementation that
 * emphasizes fragmentation avoidance and scalable concurrency support.
 * 
 * <p>The jemalloc documentation can be found <a href="http://www.canonware.com/download/jemalloc/jemalloc-latest/doc/jemalloc.html">here</a>. The jemalloc
 * <a href="https://github.com/jemalloc/jemalloc/wiki">wiki</a> also contains useful information.</p>
 * 
 * <p>The jemalloc shared library that comes with LWJGL is configured with:</p>
 * 
 * <ul>
 * <li>--with-jemalloc-prefix=je_</li>
 * <li>--with-malloc-conf=purge:decay</li>
 * <li>--disable-stats</li>
 * <li>--disable-fill</li>
 * <li>--disable-zone-allocator (MacOS)</li>
 * <li>--enable-lazy-lock=no (Windows)</li>
 * </ul>
 * 
 * <p>The shared library may be replaced with a custom build that has more features enabled.</p>
 * 
 * <p>Dynamic configuration (for enabled features) is also possible, using either the {@code MALLOC_CONF} environment variable or the
 * <a href="http://www.canonware.com/download/jemalloc/jemalloc-latest/doc/jemalloc.html#mallctl_namespace">MALLCTL NAMESPACE</a> and the
 * {@code mallctl*} functions.</p>
 */
package org.lwjgl.system.jemalloc;

