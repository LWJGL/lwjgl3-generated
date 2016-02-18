/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code style="font-family: monospace">
 * struct VkDisplayModePropertiesKHR {
 *     VkDisplayModeKHR displayMode;
 *     {@link VkDisplayModeParametersKHR VkDisplayModeParametersKHR} parameters;
 * }</code></pre>
 */
public class VkDisplayModePropertiesKHR extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		DISPLAYMODE,
		PARAMETERS;

	static {
		Layout layout = __struct(
			__member(8),
			__member(VkDisplayModeParametersKHR.SIZEOF, VkDisplayModeParametersKHR.__ALIGNMENT)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		DISPLAYMODE = layout.offsetof(0);
		PARAMETERS = layout.offsetof(1);
	}

	VkDisplayModePropertiesKHR(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkDisplayModePropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkDisplayModePropertiesKHR(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code displayMode} field. */
	public long displayMode() { return ndisplayMode(address()); }
	/** Returns a {@link VkDisplayModeParametersKHR} view of the {@code parameters} field. */
	public VkDisplayModeParametersKHR parameters() { return nparameters(address()); }

	/** Sets the specified value to the {@code displayMode} field. */
	public VkDisplayModePropertiesKHR displayMode(long value) { ndisplayMode(address(), value); return this; }
	/** Copies the specified {@link VkDisplayModeParametersKHR} to the {@code parameters} field. */
	public VkDisplayModePropertiesKHR parameters(VkDisplayModeParametersKHR value) { nparameters(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkDisplayModePropertiesKHR set(
		long displayMode,
		VkDisplayModeParametersKHR parameters
	) {
		displayMode(displayMode);
		parameters(parameters);

		return this;
	}

	/** Unsafe version of {@link #set(VkDisplayModePropertiesKHR) set}. */
	public VkDisplayModePropertiesKHR nset(long struct) {
		memCopy(struct, address(), SIZEOF);
		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public VkDisplayModePropertiesKHR set(VkDisplayModePropertiesKHR src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(VkDisplayModePropertiesKHR) set}. */
	public VkDisplayModePropertiesKHR set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link VkDisplayModePropertiesKHR} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkDisplayModePropertiesKHR malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkDisplayModePropertiesKHR} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkDisplayModePropertiesKHR calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkDisplayModePropertiesKHR} instance allocated with {@link BufferUtils}. */
	public static VkDisplayModePropertiesKHR create() {
		return new VkDisplayModePropertiesKHR(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkDisplayModePropertiesKHR} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkDisplayModePropertiesKHR create(long address) {
		return address == NULL ? null : new VkDisplayModePropertiesKHR(address, null);
	}

	/**
	 * Returns a new {@link VkDisplayModePropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDisplayModePropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDisplayModePropertiesKHR.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkDisplayModePropertiesKHR.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #displayMode}. */
	public static long ndisplayMode(long struct) { return memGetLong(struct + VkDisplayModePropertiesKHR.DISPLAYMODE); }
	/** Unsafe version of {@link #parameters}. */
	public static VkDisplayModeParametersKHR nparameters(long struct) { return VkDisplayModeParametersKHR.create(struct + VkDisplayModePropertiesKHR.PARAMETERS); }

	/** Unsafe version of {@link #displayMode(long) displayMode}. */
	public static void ndisplayMode(long struct, long value) { memPutLong(struct + VkDisplayModePropertiesKHR.DISPLAYMODE, value); }
	/** Unsafe version of {@link #parameters(VkDisplayModeParametersKHR) parameters}. */
	public static void nparameters(long struct, VkDisplayModeParametersKHR value) { memCopy(value.address(), struct + VkDisplayModePropertiesKHR.PARAMETERS, VkDisplayModeParametersKHR.SIZEOF); }

	// -----------------------------------

	/** An array of {@link VkDisplayModePropertiesKHR} structs. */
	public static final class Buffer extends StructBuffer<VkDisplayModePropertiesKHR, Buffer> {

		/**
		 * Creates a new {@link VkDisplayModePropertiesKHR.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkDisplayModePropertiesKHR#SIZEOF}, and its mark will be undefined.
		 *
		 * <p>The created buffer instance holds a strong reference to the container object.</p>
		 */
		public Buffer(ByteBuffer container) {
			super(container, container.remaining() / SIZEOF);
		}

		Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
			super(address, container, mark, pos, lim, cap);
		}

		@Override
		protected Buffer self() {
			return this;
		}

		@Override
		protected Buffer newBufferInstance(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
			return new Buffer(address, container, mark, pos, lim, cap);
		}

		@Override
		protected VkDisplayModePropertiesKHR newInstance(long address) {
			return new VkDisplayModePropertiesKHR(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code displayMode} field. */
		public long displayMode() { return VkDisplayModePropertiesKHR.ndisplayMode(address()); }
		/** Returns a {@link VkDisplayModeParametersKHR} view of the {@code parameters} field. */
		public VkDisplayModeParametersKHR parameters() { return VkDisplayModePropertiesKHR.nparameters(address()); }

		/** Sets the specified value to the {@code displayMode} field. */
		public VkDisplayModePropertiesKHR.Buffer displayMode(long value) { VkDisplayModePropertiesKHR.ndisplayMode(address(), value); return this; }
		/** Copies the specified {@link VkDisplayModeParametersKHR} to the {@code parameters} field. */
		public VkDisplayModePropertiesKHR.Buffer parameters(VkDisplayModeParametersKHR value) { VkDisplayModePropertiesKHR.nparameters(address(), value); return this; }

	}

}