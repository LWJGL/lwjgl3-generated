/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

/** Native bindings to the <strong>khr_initialize_memory</strong> extension. */
public final class KHRInitializeMemory {

	/**
	 * Accepted as a property name in the {@code properties} parameter of {@link CL10#clCreateContext CreateContext}.
	 * 
	 * <p>Describes which memory types for the context must be initialized. This is a bit-field, where the following values are currently supported:
	 * <ul>
	 * <li>{@code CL_CONTEXT_MEMORY_INITIALIZE_LOCAL_KHR} &ndash; Initialize local memory to zeros.</li>
	 * <li>{@code CL_CONTEXT_MEMORY_INITIALIZE_PRIVATE_KHR} &ndash; Initialize private memory to zeros.</li>
	 * </ul></p>
	 */
	public static final int CL_CONTEXT_MEMORY_INITIALIZE_KHR = 0x200E;

	private KHRInitializeMemory() {}

}