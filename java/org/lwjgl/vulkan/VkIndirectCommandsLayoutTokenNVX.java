/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Struct specifying the details of an indirect command layout token.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code bindingUnit} must stay within device supported limits for the appropriate commands.</li>
 * <li>{@code dynamicCount} must stay within device supported limits for the appropriate commands.</li>
 * <li>{@code divisor} must greater '0' and power of two.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code tokenType} <b>must</b> be a valid {@code VkIndirectCommandsTokenTypeNVX} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkIndirectCommandsLayoutCreateInfoNVX}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code bindingUnit} &ndash; has a different meaning depending on the type, please refer pseudo code further down for details.</li>
 * <li>{@code dynamicCount} &ndash; has a different meaning depending on the type, please refer pseudo code further down for details.</li>
 * <li>{@code divisor} &ndash; defines the rate at which the input data buffers are accessed.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkIndirectCommandsLayoutTokenNVX {
    VkIndirectCommandsTokenTypeNVX tokenType;
    uint32_t bindingUnit;
    uint32_t dynamicCount;
    uint32_t divisor;
}</code></pre>
 */
public class VkIndirectCommandsLayoutTokenNVX extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		TOKENTYPE,
		BINDINGUNIT,
		DYNAMICCOUNT,
		DIVISOR;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		TOKENTYPE = layout.offsetof(0);
		BINDINGUNIT = layout.offsetof(1);
		DYNAMICCOUNT = layout.offsetof(2);
		DIVISOR = layout.offsetof(3);
	}

	VkIndirectCommandsLayoutTokenNVX(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkIndirectCommandsLayoutTokenNVX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkIndirectCommandsLayoutTokenNVX(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code tokenType} field. */
	public int tokenType() { return ntokenType(address()); }
	/** Returns the value of the {@code bindingUnit} field. */
	public int bindingUnit() { return nbindingUnit(address()); }
	/** Returns the value of the {@code dynamicCount} field. */
	public int dynamicCount() { return ndynamicCount(address()); }
	/** Returns the value of the {@code divisor} field. */
	public int divisor() { return ndivisor(address()); }

	/** Sets the specified value to the {@code tokenType} field. */
	public VkIndirectCommandsLayoutTokenNVX tokenType(int value) { ntokenType(address(), value); return this; }
	/** Sets the specified value to the {@code bindingUnit} field. */
	public VkIndirectCommandsLayoutTokenNVX bindingUnit(int value) { nbindingUnit(address(), value); return this; }
	/** Sets the specified value to the {@code dynamicCount} field. */
	public VkIndirectCommandsLayoutTokenNVX dynamicCount(int value) { ndynamicCount(address(), value); return this; }
	/** Sets the specified value to the {@code divisor} field. */
	public VkIndirectCommandsLayoutTokenNVX divisor(int value) { ndivisor(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkIndirectCommandsLayoutTokenNVX set(
		int tokenType,
		int bindingUnit,
		int dynamicCount,
		int divisor
	) {
		tokenType(tokenType);
		bindingUnit(bindingUnit);
		dynamicCount(dynamicCount);
		divisor(divisor);

		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public VkIndirectCommandsLayoutTokenNVX set(VkIndirectCommandsLayoutTokenNVX src) {
		memCopy(src.address(), address(), SIZEOF);
		return this;
	}

	// -----------------------------------

	/** Returns a new {@link VkIndirectCommandsLayoutTokenNVX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkIndirectCommandsLayoutTokenNVX malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkIndirectCommandsLayoutTokenNVX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkIndirectCommandsLayoutTokenNVX calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkIndirectCommandsLayoutTokenNVX} instance allocated with {@link BufferUtils}. */
	public static VkIndirectCommandsLayoutTokenNVX create() {
		return new VkIndirectCommandsLayoutTokenNVX(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkIndirectCommandsLayoutTokenNVX} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkIndirectCommandsLayoutTokenNVX create(long address) {
		return address == NULL ? null : new VkIndirectCommandsLayoutTokenNVX(address, null);
	}

	/**
	 * Returns a new {@link VkIndirectCommandsLayoutTokenNVX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkIndirectCommandsLayoutTokenNVX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkIndirectCommandsLayoutTokenNVX.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkIndirectCommandsLayoutTokenNVX.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkIndirectCommandsLayoutTokenNVX} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkIndirectCommandsLayoutTokenNVX mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkIndirectCommandsLayoutTokenNVX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkIndirectCommandsLayoutTokenNVX callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkIndirectCommandsLayoutTokenNVX} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkIndirectCommandsLayoutTokenNVX mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkIndirectCommandsLayoutTokenNVX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkIndirectCommandsLayoutTokenNVX callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkIndirectCommandsLayoutTokenNVX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkIndirectCommandsLayoutTokenNVX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkIndirectCommandsLayoutTokenNVX.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkIndirectCommandsLayoutTokenNVX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #tokenType}. */
	public static int ntokenType(long struct) { return memGetInt(struct + VkIndirectCommandsLayoutTokenNVX.TOKENTYPE); }
	/** Unsafe version of {@link #bindingUnit}. */
	public static int nbindingUnit(long struct) { return memGetInt(struct + VkIndirectCommandsLayoutTokenNVX.BINDINGUNIT); }
	/** Unsafe version of {@link #dynamicCount}. */
	public static int ndynamicCount(long struct) { return memGetInt(struct + VkIndirectCommandsLayoutTokenNVX.DYNAMICCOUNT); }
	/** Unsafe version of {@link #divisor}. */
	public static int ndivisor(long struct) { return memGetInt(struct + VkIndirectCommandsLayoutTokenNVX.DIVISOR); }

	/** Unsafe version of {@link #tokenType(int) tokenType}. */
	public static void ntokenType(long struct, int value) { memPutInt(struct + VkIndirectCommandsLayoutTokenNVX.TOKENTYPE, value); }
	/** Unsafe version of {@link #bindingUnit(int) bindingUnit}. */
	public static void nbindingUnit(long struct, int value) { memPutInt(struct + VkIndirectCommandsLayoutTokenNVX.BINDINGUNIT, value); }
	/** Unsafe version of {@link #dynamicCount(int) dynamicCount}. */
	public static void ndynamicCount(long struct, int value) { memPutInt(struct + VkIndirectCommandsLayoutTokenNVX.DYNAMICCOUNT, value); }
	/** Unsafe version of {@link #divisor(int) divisor}. */
	public static void ndivisor(long struct, int value) { memPutInt(struct + VkIndirectCommandsLayoutTokenNVX.DIVISOR, value); }

	// -----------------------------------

	/** An array of {@link VkIndirectCommandsLayoutTokenNVX} structs. */
	public static class Buffer extends StructBuffer<VkIndirectCommandsLayoutTokenNVX, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link VkIndirectCommandsLayoutTokenNVX.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkIndirectCommandsLayoutTokenNVX#SIZEOF}, and its mark will be undefined.
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
		protected VkIndirectCommandsLayoutTokenNVX newInstance(long address) {
			return new VkIndirectCommandsLayoutTokenNVX(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code tokenType} field. */
		public int tokenType() { return VkIndirectCommandsLayoutTokenNVX.ntokenType(address()); }
		/** Returns the value of the {@code bindingUnit} field. */
		public int bindingUnit() { return VkIndirectCommandsLayoutTokenNVX.nbindingUnit(address()); }
		/** Returns the value of the {@code dynamicCount} field. */
		public int dynamicCount() { return VkIndirectCommandsLayoutTokenNVX.ndynamicCount(address()); }
		/** Returns the value of the {@code divisor} field. */
		public int divisor() { return VkIndirectCommandsLayoutTokenNVX.ndivisor(address()); }

		/** Sets the specified value to the {@code tokenType} field. */
		public VkIndirectCommandsLayoutTokenNVX.Buffer tokenType(int value) { VkIndirectCommandsLayoutTokenNVX.ntokenType(address(), value); return this; }
		/** Sets the specified value to the {@code bindingUnit} field. */
		public VkIndirectCommandsLayoutTokenNVX.Buffer bindingUnit(int value) { VkIndirectCommandsLayoutTokenNVX.nbindingUnit(address(), value); return this; }
		/** Sets the specified value to the {@code dynamicCount} field. */
		public VkIndirectCommandsLayoutTokenNVX.Buffer dynamicCount(int value) { VkIndirectCommandsLayoutTokenNVX.ndynamicCount(address(), value); return this; }
		/** Sets the specified value to the {@code divisor} field. */
		public VkIndirectCommandsLayoutTokenNVX.Buffer divisor(int value) { VkIndirectCommandsLayoutTokenNVX.ndivisor(address(), value); return this; }

	}

}