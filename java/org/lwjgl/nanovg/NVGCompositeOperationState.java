/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nanovg;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>struct NVGcompositeOperationState {
    int srcRGB;
    int dstRGB;
    int srcAlpha;
    int dstAlpha;
}</code></pre>
 */
public class NVGCompositeOperationState extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		SRCRGB,
		DSTRGB,
		SRCALPHA,
		DSTALPHA;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		SRCRGB = layout.offsetof(0);
		DSTRGB = layout.offsetof(1);
		SRCALPHA = layout.offsetof(2);
		DSTALPHA = layout.offsetof(3);
	}

	NVGCompositeOperationState(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NVGCompositeOperationState} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NVGCompositeOperationState(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code srcRGB} field. */
	public int srcRGB() { return nsrcRGB(address()); }
	/** Returns the value of the {@code dstRGB} field. */
	public int dstRGB() { return ndstRGB(address()); }
	/** Returns the value of the {@code srcAlpha} field. */
	public int srcAlpha() { return nsrcAlpha(address()); }
	/** Returns the value of the {@code dstAlpha} field. */
	public int dstAlpha() { return ndstAlpha(address()); }

	/** Sets the specified value to the {@code srcRGB} field. */
	public NVGCompositeOperationState srcRGB(int value) { nsrcRGB(address(), value); return this; }
	/** Sets the specified value to the {@code dstRGB} field. */
	public NVGCompositeOperationState dstRGB(int value) { ndstRGB(address(), value); return this; }
	/** Sets the specified value to the {@code srcAlpha} field. */
	public NVGCompositeOperationState srcAlpha(int value) { nsrcAlpha(address(), value); return this; }
	/** Sets the specified value to the {@code dstAlpha} field. */
	public NVGCompositeOperationState dstAlpha(int value) { ndstAlpha(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public NVGCompositeOperationState set(
		int srcRGB,
		int dstRGB,
		int srcAlpha,
		int dstAlpha
	) {
		srcRGB(srcRGB);
		dstRGB(dstRGB);
		srcAlpha(srcAlpha);
		dstAlpha(dstAlpha);

		return this;
	}

	/** Unsafe version of {@link #set(NVGCompositeOperationState) set}. */
	public NVGCompositeOperationState nset(long struct) {
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
	public NVGCompositeOperationState set(NVGCompositeOperationState src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link NVGCompositeOperationState} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static NVGCompositeOperationState malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link NVGCompositeOperationState} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static NVGCompositeOperationState calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link NVGCompositeOperationState} instance allocated with {@link BufferUtils}. */
	public static NVGCompositeOperationState create() {
		return new NVGCompositeOperationState(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link NVGCompositeOperationState} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NVGCompositeOperationState create(long address) {
		return address == NULL ? null : new NVGCompositeOperationState(address, null);
	}

	/**
	 * Returns a new {@link NVGCompositeOperationState.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NVGCompositeOperationState.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NVGCompositeOperationState.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link NVGCompositeOperationState.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link NVGCompositeOperationState} instance allocated on the thread-local {@link MemoryStack}. */
	public static NVGCompositeOperationState mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link NVGCompositeOperationState} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static NVGCompositeOperationState callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link NVGCompositeOperationState} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NVGCompositeOperationState mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link NVGCompositeOperationState} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NVGCompositeOperationState callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link NVGCompositeOperationState.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NVGCompositeOperationState.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NVGCompositeOperationState.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NVGCompositeOperationState.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #srcRGB}. */
	public static int nsrcRGB(long struct) { return memGetInt(struct + NVGCompositeOperationState.SRCRGB); }
	/** Unsafe version of {@link #dstRGB}. */
	public static int ndstRGB(long struct) { return memGetInt(struct + NVGCompositeOperationState.DSTRGB); }
	/** Unsafe version of {@link #srcAlpha}. */
	public static int nsrcAlpha(long struct) { return memGetInt(struct + NVGCompositeOperationState.SRCALPHA); }
	/** Unsafe version of {@link #dstAlpha}. */
	public static int ndstAlpha(long struct) { return memGetInt(struct + NVGCompositeOperationState.DSTALPHA); }

	/** Unsafe version of {@link #srcRGB(int) srcRGB}. */
	public static void nsrcRGB(long struct, int value) { memPutInt(struct + NVGCompositeOperationState.SRCRGB, value); }
	/** Unsafe version of {@link #dstRGB(int) dstRGB}. */
	public static void ndstRGB(long struct, int value) { memPutInt(struct + NVGCompositeOperationState.DSTRGB, value); }
	/** Unsafe version of {@link #srcAlpha(int) srcAlpha}. */
	public static void nsrcAlpha(long struct, int value) { memPutInt(struct + NVGCompositeOperationState.SRCALPHA, value); }
	/** Unsafe version of {@link #dstAlpha(int) dstAlpha}. */
	public static void ndstAlpha(long struct, int value) { memPutInt(struct + NVGCompositeOperationState.DSTALPHA, value); }

	// -----------------------------------

	/** An array of {@link NVGCompositeOperationState} structs. */
	public static final class Buffer extends StructBuffer<NVGCompositeOperationState, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link NVGCompositeOperationState.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NVGCompositeOperationState#SIZEOF}, and its mark will be undefined.
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
		protected NVGCompositeOperationState newInstance(long address) {
			return new NVGCompositeOperationState(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code srcRGB} field. */
		public int srcRGB() { return NVGCompositeOperationState.nsrcRGB(address()); }
		/** Returns the value of the {@code dstRGB} field. */
		public int dstRGB() { return NVGCompositeOperationState.ndstRGB(address()); }
		/** Returns the value of the {@code srcAlpha} field. */
		public int srcAlpha() { return NVGCompositeOperationState.nsrcAlpha(address()); }
		/** Returns the value of the {@code dstAlpha} field. */
		public int dstAlpha() { return NVGCompositeOperationState.ndstAlpha(address()); }

		/** Sets the specified value to the {@code srcRGB} field. */
		public NVGCompositeOperationState.Buffer srcRGB(int value) { NVGCompositeOperationState.nsrcRGB(address(), value); return this; }
		/** Sets the specified value to the {@code dstRGB} field. */
		public NVGCompositeOperationState.Buffer dstRGB(int value) { NVGCompositeOperationState.ndstRGB(address(), value); return this; }
		/** Sets the specified value to the {@code srcAlpha} field. */
		public NVGCompositeOperationState.Buffer srcAlpha(int value) { NVGCompositeOperationState.nsrcAlpha(address(), value); return this; }
		/** Sets the specified value to the {@code dstAlpha} field. */
		public NVGCompositeOperationState.Buffer dstAlpha(int value) { NVGCompositeOperationState.ndstAlpha(address(), value); return this; }

	}

}