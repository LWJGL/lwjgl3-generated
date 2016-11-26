/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * A single influence of a bone on a vertex.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code mVertexId} &ndash; Index of the vertex which is influenced by the bone.</li>
 * <li>{@code mWeight} &ndash; The strength of the influence in the range (0...1). The influence from all bones at one vertex amounts to 1.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct aiVertexWeight {
    unsigned int mVertexId;
    float mWeight;
}</code></pre>
 */
public class AIVertexWeight extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		MVERTEXID,
		MWEIGHT;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		MVERTEXID = layout.offsetof(0);
		MWEIGHT = layout.offsetof(1);
	}

	AIVertexWeight(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link AIVertexWeight} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public AIVertexWeight(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code mVertexId} field. */
	public int mVertexId() { return nmVertexId(address()); }
	/** Returns the value of the {@code mWeight} field. */
	public float mWeight() { return nmWeight(address()); }

	/** Sets the specified value to the {@code mVertexId} field. */
	public AIVertexWeight mVertexId(int value) { nmVertexId(address(), value); return this; }
	/** Sets the specified value to the {@code mWeight} field. */
	public AIVertexWeight mWeight(float value) { nmWeight(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public AIVertexWeight set(
		int mVertexId,
		float mWeight
	) {
		mVertexId(mVertexId);
		mWeight(mWeight);

		return this;
	}

	/** Unsafe version of {@link #set(AIVertexWeight) set}. */
	public AIVertexWeight nset(long struct) {
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
	public AIVertexWeight set(AIVertexWeight src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link AIVertexWeight} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static AIVertexWeight malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link AIVertexWeight} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static AIVertexWeight calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link AIVertexWeight} instance allocated with {@link BufferUtils}. */
	public static AIVertexWeight create() {
		return new AIVertexWeight(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link AIVertexWeight} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static AIVertexWeight create(long address) {
		return address == NULL ? null : new AIVertexWeight(address, null);
	}

	/**
	 * Returns a new {@link AIVertexWeight.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link AIVertexWeight.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link AIVertexWeight.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link AIVertexWeight.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link AIVertexWeight} instance allocated on the thread-local {@link MemoryStack}. */
	public static AIVertexWeight mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link AIVertexWeight} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static AIVertexWeight callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link AIVertexWeight} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static AIVertexWeight mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link AIVertexWeight} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static AIVertexWeight callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link AIVertexWeight.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link AIVertexWeight.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link AIVertexWeight.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link AIVertexWeight.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #mVertexId}. */
	public static int nmVertexId(long struct) { return memGetInt(struct + AIVertexWeight.MVERTEXID); }
	/** Unsafe version of {@link #mWeight}. */
	public static float nmWeight(long struct) { return memGetFloat(struct + AIVertexWeight.MWEIGHT); }

	/** Unsafe version of {@link #mVertexId(int) mVertexId}. */
	public static void nmVertexId(long struct, int value) { memPutInt(struct + AIVertexWeight.MVERTEXID, value); }
	/** Unsafe version of {@link #mWeight(float) mWeight}. */
	public static void nmWeight(long struct, float value) { memPutFloat(struct + AIVertexWeight.MWEIGHT, value); }

	// -----------------------------------

	/** An array of {@link AIVertexWeight} structs. */
	public static class Buffer extends StructBuffer<AIVertexWeight, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link AIVertexWeight.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link AIVertexWeight#SIZEOF}, and its mark will be undefined.
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
		protected AIVertexWeight newInstance(long address) {
			return new AIVertexWeight(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code mVertexId} field. */
		public int mVertexId() { return AIVertexWeight.nmVertexId(address()); }
		/** Returns the value of the {@code mWeight} field. */
		public float mWeight() { return AIVertexWeight.nmWeight(address()); }

		/** Sets the specified value to the {@code mVertexId} field. */
		public AIVertexWeight.Buffer mVertexId(int value) { AIVertexWeight.nmVertexId(address(), value); return this; }
		/** Sets the specified value to the {@code mWeight} field. */
		public AIVertexWeight.Buffer mWeight(float value) { AIVertexWeight.nmWeight(address(), value); return this; }

	}

}