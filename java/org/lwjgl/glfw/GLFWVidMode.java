/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Describes a single video mode.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code width} &ndash; the width, in screen coordinates, of the video mode</li>
 * <li>{@code height} &ndash; the height, in screen coordinates, of the video mode</li>
 * <li>{@code redBits} &ndash; the bit depth of the red channel of the video mode</li>
 * <li>{@code greenBits} &ndash; the bit depth of the green channel of the video mode</li>
 * <li>{@code blueBits} &ndash; the bit depth of the blue channel of the video mode</li>
 * <li>{@code refreshRate} &ndash; the refresh rate, in Hz, of the video mode</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct GLFWvidmode {
    int width;
    int height;
    int redBits;
    int greenBits;
    int blueBits;
    int refreshRate;
}</code></pre>
 */
public class GLFWVidMode extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		WIDTH,
		HEIGHT,
		REDBITS,
		GREENBITS,
		BLUEBITS,
		REFRESHRATE;

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
		ALIGNOF = layout.getAlignment();

		WIDTH = layout.offsetof(0);
		HEIGHT = layout.offsetof(1);
		REDBITS = layout.offsetof(2);
		GREENBITS = layout.offsetof(3);
		BLUEBITS = layout.offsetof(4);
		REFRESHRATE = layout.offsetof(5);
	}

	GLFWVidMode(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link GLFWVidMode} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public GLFWVidMode(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code width} field. */
	public int width() { return nwidth(address()); }
	/** Returns the value of the {@code height} field. */
	public int height() { return nheight(address()); }
	/** Returns the value of the {@code redBits} field. */
	public int redBits() { return nredBits(address()); }
	/** Returns the value of the {@code greenBits} field. */
	public int greenBits() { return ngreenBits(address()); }
	/** Returns the value of the {@code blueBits} field. */
	public int blueBits() { return nblueBits(address()); }
	/** Returns the value of the {@code refreshRate} field. */
	public int refreshRate() { return nrefreshRate(address()); }

	// -----------------------------------

	/** Returns a new {@link GLFWVidMode} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static GLFWVidMode malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link GLFWVidMode} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static GLFWVidMode calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link GLFWVidMode} instance allocated with {@link BufferUtils}. */
	public static GLFWVidMode create() {
		return new GLFWVidMode(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link GLFWVidMode} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static GLFWVidMode create(long address) {
		return address == NULL ? null : new GLFWVidMode(address, null);
	}

	/**
	 * Returns a new {@link GLFWVidMode.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link GLFWVidMode.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link GLFWVidMode.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link GLFWVidMode.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link GLFWVidMode} instance allocated on the thread-local {@link MemoryStack}. */
	public static GLFWVidMode mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link GLFWVidMode} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static GLFWVidMode callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link GLFWVidMode} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static GLFWVidMode mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link GLFWVidMode} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static GLFWVidMode callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link GLFWVidMode.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link GLFWVidMode.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link GLFWVidMode.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link GLFWVidMode.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #width}. */
	public static int nwidth(long struct) { return memGetInt(struct + GLFWVidMode.WIDTH); }
	/** Unsafe version of {@link #height}. */
	public static int nheight(long struct) { return memGetInt(struct + GLFWVidMode.HEIGHT); }
	/** Unsafe version of {@link #redBits}. */
	public static int nredBits(long struct) { return memGetInt(struct + GLFWVidMode.REDBITS); }
	/** Unsafe version of {@link #greenBits}. */
	public static int ngreenBits(long struct) { return memGetInt(struct + GLFWVidMode.GREENBITS); }
	/** Unsafe version of {@link #blueBits}. */
	public static int nblueBits(long struct) { return memGetInt(struct + GLFWVidMode.BLUEBITS); }
	/** Unsafe version of {@link #refreshRate}. */
	public static int nrefreshRate(long struct) { return memGetInt(struct + GLFWVidMode.REFRESHRATE); }

	// -----------------------------------

	/** An array of {@link GLFWVidMode} structs. */
	public static final class Buffer extends StructBuffer<GLFWVidMode, Buffer> {

		/**
		 * Creates a new {@link GLFWVidMode.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link GLFWVidMode#SIZEOF}, and its mark will be undefined.
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
		protected GLFWVidMode newInstance(long address) {
			return new GLFWVidMode(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code width} field. */
		public int width() { return GLFWVidMode.nwidth(address()); }
		/** Returns the value of the {@code height} field. */
		public int height() { return GLFWVidMode.nheight(address()); }
		/** Returns the value of the {@code redBits} field. */
		public int redBits() { return GLFWVidMode.nredBits(address()); }
		/** Returns the value of the {@code greenBits} field. */
		public int greenBits() { return GLFWVidMode.ngreenBits(address()); }
		/** Returns the value of the {@code blueBits} field. */
		public int blueBits() { return GLFWVidMode.nblueBits(address()); }
		/** Returns the value of the {@code refreshRate} field. */
		public int refreshRate() { return GLFWVidMode.nrefreshRate(address()); }

	}

}