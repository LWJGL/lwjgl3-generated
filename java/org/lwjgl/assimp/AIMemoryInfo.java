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
 * Stores the memory requirements for different components (e.g. meshes, materials, animations) of an import. All sizes are in bytes.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code textures} &ndash; Storage allocated for texture data</li>
 * <li>{@code materials} &ndash; Storage allocated for material data</li>
 * <li>{@code meshes} &ndash; Storage allocated for mesh data</li>
 * <li>{@code nodes} &ndash; Storage allocated for node data</li>
 * <li>{@code animations} &ndash; Storage allocated for animation data</li>
 * <li>{@code cameras} &ndash; Storage allocated for camera data</li>
 * <li>{@code lights} &ndash; Storage allocated for light data</li>
 * <li>{@code total} &ndash; Total storage allocated for the full import.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct aiMemoryInfo {
    unsigned int textures;
    unsigned int materials;
    unsigned int meshes;
    unsigned int nodes;
    unsigned int animations;
    unsigned int cameras;
    unsigned int lights;
    unsigned int total;
}</code></pre>
 */
public class AIMemoryInfo extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		TEXTURES,
		MATERIALS,
		MESHES,
		NODES,
		ANIMATIONS,
		CAMERAS,
		LIGHTS,
		TOTAL;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		TEXTURES = layout.offsetof(0);
		MATERIALS = layout.offsetof(1);
		MESHES = layout.offsetof(2);
		NODES = layout.offsetof(3);
		ANIMATIONS = layout.offsetof(4);
		CAMERAS = layout.offsetof(5);
		LIGHTS = layout.offsetof(6);
		TOTAL = layout.offsetof(7);
	}

	AIMemoryInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link AIMemoryInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public AIMemoryInfo(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code textures} field. */
	public int textures() { return ntextures(address()); }
	/** Returns the value of the {@code materials} field. */
	public int materials() { return nmaterials(address()); }
	/** Returns the value of the {@code meshes} field. */
	public int meshes() { return nmeshes(address()); }
	/** Returns the value of the {@code nodes} field. */
	public int nodes() { return nnodes(address()); }
	/** Returns the value of the {@code animations} field. */
	public int animations() { return nanimations(address()); }
	/** Returns the value of the {@code cameras} field. */
	public int cameras() { return ncameras(address()); }
	/** Returns the value of the {@code lights} field. */
	public int lights() { return nlights(address()); }
	/** Returns the value of the {@code total} field. */
	public int total() { return ntotal(address()); }

	// -----------------------------------

	/** Returns a new {@link AIMemoryInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static AIMemoryInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link AIMemoryInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static AIMemoryInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link AIMemoryInfo} instance allocated with {@link BufferUtils}. */
	public static AIMemoryInfo create() {
		return new AIMemoryInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link AIMemoryInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static AIMemoryInfo create(long address) {
		return address == NULL ? null : new AIMemoryInfo(address, null);
	}

	/**
	 * Returns a new {@link AIMemoryInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link AIMemoryInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link AIMemoryInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link AIMemoryInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link AIMemoryInfo} instance allocated on the thread-local {@link MemoryStack}. */
	public static AIMemoryInfo mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link AIMemoryInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static AIMemoryInfo callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link AIMemoryInfo} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static AIMemoryInfo mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link AIMemoryInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static AIMemoryInfo callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link AIMemoryInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link AIMemoryInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link AIMemoryInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link AIMemoryInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #textures}. */
	public static int ntextures(long struct) { return memGetInt(struct + AIMemoryInfo.TEXTURES); }
	/** Unsafe version of {@link #materials}. */
	public static int nmaterials(long struct) { return memGetInt(struct + AIMemoryInfo.MATERIALS); }
	/** Unsafe version of {@link #meshes}. */
	public static int nmeshes(long struct) { return memGetInt(struct + AIMemoryInfo.MESHES); }
	/** Unsafe version of {@link #nodes}. */
	public static int nnodes(long struct) { return memGetInt(struct + AIMemoryInfo.NODES); }
	/** Unsafe version of {@link #animations}. */
	public static int nanimations(long struct) { return memGetInt(struct + AIMemoryInfo.ANIMATIONS); }
	/** Unsafe version of {@link #cameras}. */
	public static int ncameras(long struct) { return memGetInt(struct + AIMemoryInfo.CAMERAS); }
	/** Unsafe version of {@link #lights}. */
	public static int nlights(long struct) { return memGetInt(struct + AIMemoryInfo.LIGHTS); }
	/** Unsafe version of {@link #total}. */
	public static int ntotal(long struct) { return memGetInt(struct + AIMemoryInfo.TOTAL); }

	// -----------------------------------

	/** An array of {@link AIMemoryInfo} structs. */
	public static class Buffer extends StructBuffer<AIMemoryInfo, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link AIMemoryInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link AIMemoryInfo#SIZEOF}, and its mark will be undefined.
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
		protected AIMemoryInfo newInstance(long address) {
			return new AIMemoryInfo(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code textures} field. */
		public int textures() { return AIMemoryInfo.ntextures(address()); }
		/** Returns the value of the {@code materials} field. */
		public int materials() { return AIMemoryInfo.nmaterials(address()); }
		/** Returns the value of the {@code meshes} field. */
		public int meshes() { return AIMemoryInfo.nmeshes(address()); }
		/** Returns the value of the {@code nodes} field. */
		public int nodes() { return AIMemoryInfo.nnodes(address()); }
		/** Returns the value of the {@code animations} field. */
		public int animations() { return AIMemoryInfo.nanimations(address()); }
		/** Returns the value of the {@code cameras} field. */
		public int cameras() { return AIMemoryInfo.ncameras(address()); }
		/** Returns the value of the {@code lights} field. */
		public int lights() { return AIMemoryInfo.nlights(address()); }
		/** Returns the value of the {@code total} field. */
		public int total() { return AIMemoryInfo.ntotal(address()); }

	}

}