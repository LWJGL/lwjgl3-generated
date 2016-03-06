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

/** Instances of this interface may be set to the {@code pfnAllocation} member of the {@link VkAllocationCallbacks} struct. */
public abstract class VkAllocationFunction extends Closure.P {

	private static final FFICIF        CIF  = apiClosureCIF();
	private static final PointerBuffer ARGS = apiClosureArgs(4);

	private static final long CLASSPATH = apiClosureText("org.lwjgl.vulkan.VkAllocationFunction");

	static {
		prepareCIF(
			CALL_CONVENTION_SYSTEM,
			CIF, ffi_type_pointer,
			ARGS, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_sint32
		);
	}

	protected VkAllocationFunction() {
		super(CIF, CLASSPATH);
	}

	/**
	 * Will be called from a libffi closure invocation. Decodes the arguments and passes them to {@link #invoke}.
	 *
	 * @param args pointer to an array of jvalues
	 */
	@Override
	protected long callback(long args) {
		return invoke(
			memGetAddress(memGetAddress(POINTER_SIZE * 0 + args)),
			memGetAddress(memGetAddress(POINTER_SIZE * 1 + args)),
			memGetAddress(memGetAddress(POINTER_SIZE * 2 + args)),
			memGetInt(memGetAddress(POINTER_SIZE * 3 + args))
		);
	}

	/**
	 * Will be called by the Vulkan implementation to allocate memory.
	 *
	 * @param pUserData       the value specified for {@link VkAllocationCallbacks}{@code .pUserData} in the allocator specified by the application
	 * @param size            the size in bytes of the requested allocation
	 * @param alignment       the requested alignment of the allocation in bytes and <b>must</b> be a power of two
	 * @param allocationScope a {@code VkSystemAllocationScope} value specifying the scope of the lifetime of the allocation
	 *
	 * @return <b>must</b> either return {@code NULL} (in case of allocation failure or if size is zero) or a valid pointer to a memory allocation containing at least size bytes, and
	 *         with the pointer value being a multiple of alignment.
	 */
	public abstract long invoke(long pUserData, long size, long alignment, int allocationScope);

	/** A functional interface for {@link VkAllocationFunction}. */
	public interface SAM {
		long invoke(long pUserData, long size, long alignment, int allocationScope);
	}

	/**
	 * Creates a {@link VkAllocationFunction} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link VkAllocationFunction} instance
	 */
	public static VkAllocationFunction create(final SAM sam) {
		return new VkAllocationFunction() {
			@Override
			public long invoke(long pUserData, long size, long alignment, int allocationScope) {
				return sam.invoke(pUserData, size, alignment, allocationScope);
			}
		};
	}

}