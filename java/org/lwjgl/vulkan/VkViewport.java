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
 * struct VkViewport {
 *     float x;
 *     float y;
 *     float width;
 *     float height;
 *     float minDepth;
 *     float maxDepth;
 * }</code></pre>
 */
public class VkViewport extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		X,
		Y,
		WIDTH,
		HEIGHT,
		MINDEPTH,
		MAXDEPTH;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		X = layout.offsetof(0);
		Y = layout.offsetof(1);
		WIDTH = layout.offsetof(2);
		HEIGHT = layout.offsetof(3);
		MINDEPTH = layout.offsetof(4);
		MAXDEPTH = layout.offsetof(5);
	}

	VkViewport(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkViewport} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkViewport(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code x} field. */
	public float x() { return nx(address()); }
	/** Returns the value of the {@code y} field. */
	public float y() { return ny(address()); }
	/** Returns the value of the {@code width} field. */
	public float width() { return nwidth(address()); }
	/** Returns the value of the {@code height} field. */
	public float height() { return nheight(address()); }
	/** Returns the value of the {@code minDepth} field. */
	public float minDepth() { return nminDepth(address()); }
	/** Returns the value of the {@code maxDepth} field. */
	public float maxDepth() { return nmaxDepth(address()); }

	/** Sets the specified value to the {@code x} field. */
	public VkViewport x(float value) { nx(address(), value); return this; }
	/** Sets the specified value to the {@code y} field. */
	public VkViewport y(float value) { ny(address(), value); return this; }
	/** Sets the specified value to the {@code width} field. */
	public VkViewport width(float value) { nwidth(address(), value); return this; }
	/** Sets the specified value to the {@code height} field. */
	public VkViewport height(float value) { nheight(address(), value); return this; }
	/** Sets the specified value to the {@code minDepth} field. */
	public VkViewport minDepth(float value) { nminDepth(address(), value); return this; }
	/** Sets the specified value to the {@code maxDepth} field. */
	public VkViewport maxDepth(float value) { nmaxDepth(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkViewport set(
		float x,
		float y,
		float width,
		float height,
		float minDepth,
		float maxDepth
	) {
		x(x);
		y(y);
		width(width);
		height(height);
		minDepth(minDepth);
		maxDepth(maxDepth);

		return this;
	}

	/** Unsafe version of {@link #set(VkViewport) set}. */
	public VkViewport nset(long struct) {
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
	public VkViewport set(VkViewport src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkViewport} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkViewport malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkViewport} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkViewport calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkViewport} instance allocated with {@link BufferUtils}. */
	public static VkViewport create() {
		return new VkViewport(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkViewport} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkViewport create(long address) {
		return address == NULL ? null : new VkViewport(address, null);
	}

	/**
	 * Returns a new {@link VkViewport.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkViewport.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkViewport.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkViewport.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #x}. */
	public static float nx(long struct) { return memGetFloat(struct + VkViewport.X); }
	/** Unsafe version of {@link #y}. */
	public static float ny(long struct) { return memGetFloat(struct + VkViewport.Y); }
	/** Unsafe version of {@link #width}. */
	public static float nwidth(long struct) { return memGetFloat(struct + VkViewport.WIDTH); }
	/** Unsafe version of {@link #height}. */
	public static float nheight(long struct) { return memGetFloat(struct + VkViewport.HEIGHT); }
	/** Unsafe version of {@link #minDepth}. */
	public static float nminDepth(long struct) { return memGetFloat(struct + VkViewport.MINDEPTH); }
	/** Unsafe version of {@link #maxDepth}. */
	public static float nmaxDepth(long struct) { return memGetFloat(struct + VkViewport.MAXDEPTH); }

	/** Unsafe version of {@link #x(float) x}. */
	public static void nx(long struct, float value) { memPutFloat(struct + VkViewport.X, value); }
	/** Unsafe version of {@link #y(float) y}. */
	public static void ny(long struct, float value) { memPutFloat(struct + VkViewport.Y, value); }
	/** Unsafe version of {@link #width(float) width}. */
	public static void nwidth(long struct, float value) { memPutFloat(struct + VkViewport.WIDTH, value); }
	/** Unsafe version of {@link #height(float) height}. */
	public static void nheight(long struct, float value) { memPutFloat(struct + VkViewport.HEIGHT, value); }
	/** Unsafe version of {@link #minDepth(float) minDepth}. */
	public static void nminDepth(long struct, float value) { memPutFloat(struct + VkViewport.MINDEPTH, value); }
	/** Unsafe version of {@link #maxDepth(float) maxDepth}. */
	public static void nmaxDepth(long struct, float value) { memPutFloat(struct + VkViewport.MAXDEPTH, value); }

	// -----------------------------------

	/** An array of {@link VkViewport} structs. */
	public static final class Buffer extends StructBuffer<VkViewport, Buffer> {

		/**
		 * Creates a new {@link VkViewport.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkViewport#SIZEOF}, and its mark will be undefined.
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
		protected VkViewport newInstance(long address) {
			return new VkViewport(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code x} field. */
		public float x() { return VkViewport.nx(address()); }
		/** Returns the value of the {@code y} field. */
		public float y() { return VkViewport.ny(address()); }
		/** Returns the value of the {@code width} field. */
		public float width() { return VkViewport.nwidth(address()); }
		/** Returns the value of the {@code height} field. */
		public float height() { return VkViewport.nheight(address()); }
		/** Returns the value of the {@code minDepth} field. */
		public float minDepth() { return VkViewport.nminDepth(address()); }
		/** Returns the value of the {@code maxDepth} field. */
		public float maxDepth() { return VkViewport.nmaxDepth(address()); }

		/** Sets the specified value to the {@code x} field. */
		public VkViewport.Buffer x(float value) { VkViewport.nx(address(), value); return this; }
		/** Sets the specified value to the {@code y} field. */
		public VkViewport.Buffer y(float value) { VkViewport.ny(address(), value); return this; }
		/** Sets the specified value to the {@code width} field. */
		public VkViewport.Buffer width(float value) { VkViewport.nwidth(address(), value); return this; }
		/** Sets the specified value to the {@code height} field. */
		public VkViewport.Buffer height(float value) { VkViewport.nheight(address(), value); return this; }
		/** Sets the specified value to the {@code minDepth} field. */
		public VkViewport.Buffer minDepth(float value) { VkViewport.nminDepth(address(), value); return this; }
		/** Sets the specified value to the {@code maxDepth} field. */
		public VkViewport.Buffer maxDepth(float value) { VkViewport.nmaxDepth(address(), value); return this; }

	}

}