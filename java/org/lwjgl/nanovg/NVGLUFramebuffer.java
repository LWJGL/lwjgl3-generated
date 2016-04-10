/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nanovg;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * A framebuffer object.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code fbo} &ndash; the OpenGL framebuffer object handle</li>
 * <li>{@code rbo} &ndash; the OpenGL renderbuffer handle</li>
 * <li>{@code texture} &ndash; the OpenGL texture handle</li>
 * <li>{@code image} &ndash; the NanoVG image handle</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct NVGLUframebuffer {
    GLuint fbo;
    GLuint rbo;
    GLuint texture;
    int image;
}</code></pre>
 */
public class NVGLUFramebuffer extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		FBO,
		RBO,
		TEXTURE,
		IMAGE;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		FBO = layout.offsetof(0);
		RBO = layout.offsetof(1);
		TEXTURE = layout.offsetof(2);
		IMAGE = layout.offsetof(3);
	}

	NVGLUFramebuffer(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NVGLUFramebuffer} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NVGLUFramebuffer(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code fbo} field. */
	public int fbo() { return nfbo(address()); }
	/** Returns the value of the {@code rbo} field. */
	public int rbo() { return nrbo(address()); }
	/** Returns the value of the {@code texture} field. */
	public int texture() { return ntexture(address()); }
	/** Returns the value of the {@code image} field. */
	public int image() { return nimage(address()); }

	// -----------------------------------

	/** Returns a new {@link NVGLUFramebuffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static NVGLUFramebuffer malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link NVGLUFramebuffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static NVGLUFramebuffer calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link NVGLUFramebuffer} instance allocated with {@link BufferUtils}. */
	public static NVGLUFramebuffer create() {
		return new NVGLUFramebuffer(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link NVGLUFramebuffer} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NVGLUFramebuffer create(long address) {
		return address == NULL ? null : new NVGLUFramebuffer(address, null);
	}

	/**
	 * Returns a new {@link NVGLUFramebuffer.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NVGLUFramebuffer.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NVGLUFramebuffer.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link NVGLUFramebuffer.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link NVGLUFramebuffer} instance allocated on the thread-local {@link MemoryStack}. */
	public static NVGLUFramebuffer mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link NVGLUFramebuffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static NVGLUFramebuffer callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link NVGLUFramebuffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NVGLUFramebuffer mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link NVGLUFramebuffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NVGLUFramebuffer callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link NVGLUFramebuffer.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NVGLUFramebuffer.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NVGLUFramebuffer.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NVGLUFramebuffer.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #fbo}. */
	public static int nfbo(long struct) { return memGetInt(struct + NVGLUFramebuffer.FBO); }
	/** Unsafe version of {@link #rbo}. */
	public static int nrbo(long struct) { return memGetInt(struct + NVGLUFramebuffer.RBO); }
	/** Unsafe version of {@link #texture}. */
	public static int ntexture(long struct) { return memGetInt(struct + NVGLUFramebuffer.TEXTURE); }
	/** Unsafe version of {@link #image}. */
	public static int nimage(long struct) { return memGetInt(struct + NVGLUFramebuffer.IMAGE); }

	// -----------------------------------

	/** An array of {@link NVGLUFramebuffer} structs. */
	public static final class Buffer extends StructBuffer<NVGLUFramebuffer, Buffer> {

		/**
		 * Creates a new {@link NVGLUFramebuffer.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NVGLUFramebuffer#SIZEOF}, and its mark will be undefined.
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
		protected NVGLUFramebuffer newInstance(long address) {
			return new NVGLUFramebuffer(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code fbo} field. */
		public int fbo() { return NVGLUFramebuffer.nfbo(address()); }
		/** Returns the value of the {@code rbo} field. */
		public int rbo() { return NVGLUFramebuffer.nrbo(address()); }
		/** Returns the value of the {@code texture} field. */
		public int texture() { return NVGLUFramebuffer.ntexture(address()); }
		/** Returns the value of the {@code image} field. */
		public int image() { return NVGLUFramebuffer.nimage(address()); }

	}

}