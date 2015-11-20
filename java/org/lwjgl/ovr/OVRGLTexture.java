/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Contains OpenGL-specific texture information.
 * 
 * <h3>ovrGLTexture members</h3>
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><th>Member</th><th>Type</th><th>Description</th></tr>
 * <tr><td>Texture</td><td class="nw">{@link OVRTexture ovrTexture}</td><td>general device settings</td></tr>
 * <tr><td>OGL</td><td class="nw">{@link OVRGLTextureData ovrGLTextureData}</td><td>OpenGL-specific settings</td></tr>
 * </table>
 */
public class OVRGLTexture extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		TEXTURE,
		OGL;

	static {
		Layout layout = __union(
			__member(OVRTexture.SIZEOF, OVRTexture.__ALIGNMENT),
			__member(OVRGLTextureData.SIZEOF, OVRGLTextureData.__ALIGNMENT)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		TEXTURE = layout.offsetof(0);
		OGL = layout.offsetof(1);
	}

	OVRGLTexture(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link OVRGLTexture} instance at the specified memory address. */
	public OVRGLTexture(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link OVRGLTexture} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRGLTexture(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link OVRTexture} view of the {@code Texture} field. */
	public OVRTexture Texture() { return nTexture(address()); }
	/** Returns a {@link OVRGLTextureData} view of the {@code OGL} field. */
	public OVRGLTextureData OGL() { return nOGL(address()); }

	/** Copies the specified {@link OVRTexture} to the {@code Texture} field. */
	public OVRGLTexture Texture(OVRTexture value) { nTexture(address(), value); return this; }
	/** Copies the specified {@link OVRGLTextureData} to the {@code OGL} field. */
	public OVRGLTexture OGL(OVRGLTextureData value) { nOGL(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public OVRGLTexture set(
		OVRTexture Texture,
		OVRGLTextureData OGL
	) {
		Texture(Texture);
		OGL(OGL);

		return this;
	}

	/** Unsafe version of {@link #set(OVRGLTexture) set}. */
	public OVRGLTexture nset(long struct) {
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
	public OVRGLTexture set(OVRGLTexture src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(OVRGLTexture) set}. */
	public OVRGLTexture set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link OVRGLTexture} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static OVRGLTexture malloc() {
		return new OVRGLTexture(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRGLTexture} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static OVRGLTexture calloc() {
		return new OVRGLTexture(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRGLTexture} instance allocated with {@link BufferUtils}. */
	public static OVRGLTexture create() {
		return new OVRGLTexture(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link OVRGLTexture.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link OVRGLTexture.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRGLTexture.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link OVRGLTexture.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	/** Unsafe version of {@link #Texture}. */
	public static OVRTexture nTexture(long struct) { return new OVRTexture(struct + OVRGLTexture.TEXTURE); }
	/** Unsafe version of {@link #OGL}. */
	public static OVRGLTextureData nOGL(long struct) { return new OVRGLTextureData(struct + OVRGLTexture.OGL); }

	/** Unsafe version of {@link #Texture(OVRTexture) Texture}. */
	public static void nTexture(long struct, OVRTexture value) { memCopy(value.address(), struct + OVRGLTexture.TEXTURE, OVRTexture.SIZEOF); }
	/** Unsafe version of {@link #OGL(OVRGLTextureData) OGL}. */
	public static void nOGL(long struct, OVRGLTextureData value) { memCopy(value.address(), struct + OVRGLTexture.OGL, OVRGLTextureData.SIZEOF); }

	// -----------------------------------

	/** An array of {@link OVRGLTexture} structs. */
	public static final class Buffer extends StructBuffer<OVRGLTexture, Buffer> {

		/**
		 * Creates a new {@link OVRGLTexture.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRGLTexture#SIZEOF}, and its mark will be undefined.
		 *
		 * <p>The created buffer instance holds a strong reference to the container object.</p>
		 */
		public Buffer(ByteBuffer container) {
			this(container.slice(), SIZEOF);
		}

		Buffer(ByteBuffer container, int SIZEOF) {
			super(container, SIZEOF);
		}

		@Override
		protected Buffer self() {
			return this;
		}

		@Override
		protected Buffer newBufferInstance(ByteBuffer buffer) {
			return new Buffer(buffer);
		}

		@Override
		protected OVRGLTexture newInstance(long address) {
			return new OVRGLTexture(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link OVRTexture} view of the {@code Texture} field. */
		public OVRTexture Texture() { return nTexture(address()); }
		/** Returns a {@link OVRGLTextureData} view of the {@code OGL} field. */
		public OVRGLTextureData OGL() { return nOGL(address()); }

		/** Copies the specified {@link OVRTexture} to the {@code Texture} field. */
		public OVRGLTexture.Buffer Texture(OVRTexture value) { nTexture(address(), value); return this; }
		/** Copies the specified {@link OVRGLTextureData} to the {@code OGL} field. */
		public OVRGLTexture.Buffer OGL(OVRGLTextureData value) { nOGL(address(), value); return this; }

	}

}