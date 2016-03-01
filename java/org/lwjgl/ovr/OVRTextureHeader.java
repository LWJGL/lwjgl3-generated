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
 * API-independent part of a texture descriptor.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct ovrTextureHeader {
    ovrRenderAPIType API;
    {@link OVRSizei ovrSizei} TextureSize;
}</code></pre>
 * 
 * <h3>Member documentation</h3>
 * 
 * <table class=lwjgl>
 * <tr><td>API</td><td>the graphics API in use</td></tr>
 * <tr><td>TextureSize</td><td>the size of the texture</td></tr>
 * </table>
 */
public class OVRTextureHeader extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		API,
		TEXTURESIZE;

	static {
		Layout layout = __struct(
			__member(4),
			__member(OVRSizei.SIZEOF, OVRSizei.__ALIGNMENT)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		API = layout.offsetof(0);
		TEXTURESIZE = layout.offsetof(1);
	}

	OVRTextureHeader(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link OVRTextureHeader} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRTextureHeader(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code API} field. */
	public int API() { return nAPI(address()); }
	/** Returns a {@link OVRSizei} view of the {@code TextureSize} field. */
	public OVRSizei TextureSize() { return nTextureSize(address()); }

	/** Sets the specified value to the {@code API} field. */
	public OVRTextureHeader API(int value) { nAPI(address(), value); return this; }
	/** Copies the specified {@link OVRSizei} to the {@code TextureSize} field. */
	public OVRTextureHeader TextureSize(OVRSizei value) { nTextureSize(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public OVRTextureHeader set(
		int API,
		OVRSizei TextureSize
	) {
		API(API);
		TextureSize(TextureSize);

		return this;
	}

	/** Unsafe version of {@link #set(OVRTextureHeader) set}. */
	public OVRTextureHeader nset(long struct) {
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
	public OVRTextureHeader set(OVRTextureHeader src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link OVRTextureHeader} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static OVRTextureHeader malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRTextureHeader} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static OVRTextureHeader calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRTextureHeader} instance allocated with {@link BufferUtils}. */
	public static OVRTextureHeader create() {
		return new OVRTextureHeader(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link OVRTextureHeader} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static OVRTextureHeader create(long address) {
		return address == NULL ? null : new OVRTextureHeader(address, null);
	}

	/**
	 * Returns a new {@link OVRTextureHeader.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRTextureHeader.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRTextureHeader.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link OVRTextureHeader.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #API}. */
	public static int nAPI(long struct) { return memGetInt(struct + OVRTextureHeader.API); }
	/** Unsafe version of {@link #TextureSize}. */
	public static OVRSizei nTextureSize(long struct) { return OVRSizei.create(struct + OVRTextureHeader.TEXTURESIZE); }

	/** Unsafe version of {@link #API(int) API}. */
	public static void nAPI(long struct, int value) { memPutInt(struct + OVRTextureHeader.API, value); }
	/** Unsafe version of {@link #TextureSize(OVRSizei) TextureSize}. */
	public static void nTextureSize(long struct, OVRSizei value) { memCopy(value.address(), struct + OVRTextureHeader.TEXTURESIZE, OVRSizei.SIZEOF); }

	// -----------------------------------

	/** An array of {@link OVRTextureHeader} structs. */
	public static final class Buffer extends StructBuffer<OVRTextureHeader, Buffer> {

		/**
		 * Creates a new {@link OVRTextureHeader.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRTextureHeader#SIZEOF}, and its mark will be undefined.
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
		protected OVRTextureHeader newInstance(long address) {
			return new OVRTextureHeader(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code API} field. */
		public int API() { return OVRTextureHeader.nAPI(address()); }
		/** Returns a {@link OVRSizei} view of the {@code TextureSize} field. */
		public OVRSizei TextureSize() { return OVRTextureHeader.nTextureSize(address()); }

		/** Sets the specified value to the {@code API} field. */
		public OVRTextureHeader.Buffer API(int value) { OVRTextureHeader.nAPI(address(), value); return this; }
		/** Copies the specified {@link OVRSizei} to the {@code TextureSize} field. */
		public OVRTextureHeader.Buffer TextureSize(OVRSizei value) { OVRTextureHeader.nTextureSize(address(), value); return this; }

	}

}