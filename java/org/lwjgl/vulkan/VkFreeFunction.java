/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/**
 * Instances of this interface may be set to the {@code pfnFree} member of the {@link VkAllocationCallbacks} struct.
 * 
 * <p>{@code pMemory may} be {@code NULL}, which the callback <b>must</b> handle safely. If {@code pMemory} is non-{@code NULL}, it must be a pointer previously allocated by
 * {@code pfnAllocation} or {@code pfnReallocation} and must be freed by the function.</p>
 */
public abstract class VkFreeFunction extends Closure.V {

	private static final FFICIF        CIF  = apiClosureCIF();
	private static final PointerBuffer ARGS = apiClosureArgs(2);

	private static final long CLASSPATH = apiClosureText("org.lwjgl.vulkan.VkFreeFunction");

	static {
		prepareCIF(
			CALL_CONVENTION_SYSTEM,
			CIF, ffi_type_void,
			ARGS, ffi_type_pointer, ffi_type_pointer
		);
	}

	protected VkFreeFunction() {
		super(CIF, CLASSPATH);
	}

	/**
	 * Will be called from a libffi closure invocation. Decodes the arguments and passes them to {@link #invoke}.
	 *
	 * @param args pointer to an array of jvalues
	 */
	@Override
	protected void callback(long args) {
		invoke(
			memGetAddress(memGetAddress(POINTER_SIZE * 0 + args)),
			memGetAddress(memGetAddress(POINTER_SIZE * 1 + args))
		);
	}

	/**
	 * Will be called by the Vulkan implementation to free memory.
	 *
	 * @param pUserData the value specified for {@link VkAllocationCallbacks}{@code .pUserData} in the allocator specified by the application
	 * @param pMemory   the allocation to be freed
	 */
	public abstract void invoke(long pUserData, long pMemory);

	/** A functional interface for {@link VkFreeFunction}. */
	public interface SAM {
		void invoke(long pUserData, long pMemory);
	}

	/**
	 * Creates a {@link VkFreeFunction} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link VkFreeFunction} instance
	 */
	public static VkFreeFunction create(final SAM sam) {
		return new VkFreeFunction() {
			@Override
			public void invoke(long pUserData, long pMemory) {
				sam.invoke(pUserData, pMemory);
			}
		};
	}

}