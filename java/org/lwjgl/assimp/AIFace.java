/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * A single face in a mesh, referring to multiple vertices.
 * 
 * <p>If {@code mNumIndices} is 3, we call the face 'triangle', for {@code mNumIndices > 3} it's called 'polygon' (hey, that's just a definition!).</p>
 * 
 * <p>{@link AIMesh}{@code ::mPrimitiveTypes} can be queried to quickly examine which types of primitive are actually present in a mesh. The {@link Assimp#aiProcess_SortByPType Process_SortByPType}
 * flag executes a special post-processing algorithm which splits meshes with *different* primitive types mixed up (e.g. lines and triangles) in several
 * 'clean' submeshes. Furthermore there is a configuration option ({@link Assimp#AI_CONFIG_PP_SBP_REMOVE}) to force {@link Assimp#aiProcess_SortByPType Process_SortByPType} to remove specific kinds of
 * primitives from the imported scene, completely and forever.</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code mNumIndices} &ndash; Number of indices defining this face. The maximum value for this member is {@link Assimp#AI_MAX_FACE_INDICES}.</li>
 * <li>{@code mIndices} &ndash; Pointer to the indices array. Size of the array is given in {@code numIndices}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct aiFace {
    unsigned int mNumIndices;
    unsigned int * mIndices;
}</code></pre>
 */
public class AIFace extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		MNUMINDICES,
		MINDICES;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		MNUMINDICES = layout.offsetof(0);
		MINDICES = layout.offsetof(1);
	}

	AIFace(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link AIFace} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public AIFace(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code mNumIndices} field. */
	public int mNumIndices() { return nmNumIndices(address()); }
	/** Returns a {@link IntBuffer} view of the data pointed to by the {@code mIndices} field. */
	public IntBuffer mIndices() { return nmIndices(address()); }

	/** Sets the address of the specified {@link IntBuffer} to the {@code mIndices} field. */
	public AIFace mIndices(IntBuffer value) { nmIndices(address(), value); return this; }

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public AIFace set(AIFace src) {
		memCopy(src.address(), address(), SIZEOF);
		return this;
	}

	// -----------------------------------

	/** Returns a new {@link AIFace} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static AIFace malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link AIFace} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static AIFace calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link AIFace} instance allocated with {@link BufferUtils}. */
	public static AIFace create() {
		return new AIFace(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link AIFace} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static AIFace create(long address) {
		return address == NULL ? null : new AIFace(address, null);
	}

	/**
	 * Returns a new {@link AIFace.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link AIFace.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link AIFace.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link AIFace.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link AIFace} instance allocated on the thread-local {@link MemoryStack}. */
	public static AIFace mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link AIFace} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static AIFace callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link AIFace} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static AIFace mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link AIFace} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static AIFace callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link AIFace.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link AIFace.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link AIFace.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link AIFace.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #mNumIndices}. */
	public static int nmNumIndices(long struct) { return memGetInt(struct + AIFace.MNUMINDICES); }
	/** Unsafe version of {@link #mIndices() mIndices}. */
	public static IntBuffer nmIndices(long struct) { return memIntBuffer(memGetAddress(struct + AIFace.MINDICES), nmNumIndices(struct)); }

	/** Sets the specified value to the {@code mNumIndices} field of the specified {@code struct}. */
	public static void nmNumIndices(long struct, int value) { memPutInt(struct + AIFace.MNUMINDICES, value); }
	/** Unsafe version of {@link #mIndices(IntBuffer) mIndices}. */
	public static void nmIndices(long struct, IntBuffer value) { memPutAddress(struct + AIFace.MINDICES, memAddress(value)); nmNumIndices(struct, value.remaining()); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		check(memGetAddress(struct + AIFace.MINDICES));
	}

	/**
	 * Calls {@link #validate(long)} for each struct contained in the specified struct array.
	 *
	 * @param array the struct array to validate
	 * @param count the number of structs in {@code array}
	 */
	public static void validate(long array, int count) {
		for ( int i = 0; i < count; i++ )
			validate(array + i * SIZEOF);
	}

	// -----------------------------------

	/** An array of {@link AIFace} structs. */
	public static class Buffer extends StructBuffer<AIFace, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link AIFace.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link AIFace#SIZEOF}, and its mark will be undefined.
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
		protected AIFace newInstance(long address) {
			return new AIFace(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code mNumIndices} field. */
		public int mNumIndices() { return AIFace.nmNumIndices(address()); }
		/** Returns a {@link IntBuffer} view of the data pointed to by the {@code mIndices} field. */
		public IntBuffer mIndices() { return AIFace.nmIndices(address()); }

		/** Sets the address of the specified {@link IntBuffer} to the {@code mIndices} field. */
		public AIFace.Buffer mIndices(IntBuffer value) { AIFace.nmIndices(address(), value); return this; }

	}

}