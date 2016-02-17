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

/**  */
public abstract class VkInternalAllocationNotification extends Closure.V {

	private static final FFICIF        CIF  = apiClosureCIF();
	private static final PointerBuffer ARGS = apiClosureArgs(4);

	private static final long CLASSPATH = apiClosureText("org.lwjgl.vulkan.VkInternalAllocationNotification");

	static {
		prepareCIF(
			CALL_CONVENTION_SYSTEM,
			CIF, ffi_type_void,
			ARGS, ffi_type_pointer, ffi_type_pointer, ffi_type_sint32, ffi_type_sint32
		);
	}

	protected VkInternalAllocationNotification() {
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
			memGetAddress(memGetAddress(POINTER_SIZE * 1 + args)),
			memGetInt(memGetAddress(POINTER_SIZE * 2 + args)),
			memGetInt(memGetAddress(POINTER_SIZE * 3 + args))
		);
	}


	public abstract void invoke(long pUserData, long size, int allocationType, int allocationScope);

	/** A functional interface for {@link VkInternalAllocationNotification}. */
	public interface SAM {
		void invoke(long pUserData, long size, int allocationType, int allocationScope);
	}

	/**
	 * Creates a {@link VkInternalAllocationNotification} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link VkInternalAllocationNotification} instance
	 */
	public static VkInternalAllocationNotification create(final SAM sam) {
		return new VkInternalAllocationNotification() {
			@Override
			public void invoke(long pUserData, long size, int allocationType, int allocationScope) {
				sam.invoke(pUserData, size, allocationType, allocationScope);
			}
		};
	}

}