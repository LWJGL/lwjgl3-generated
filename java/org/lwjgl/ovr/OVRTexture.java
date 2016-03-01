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
 * Contains platform-specific information about a texture. Aliases to one of ovrD3D11Texture or {@link OVRGLTexture}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct ovrTexture {
    {@link OVRTextureHeader ovrTextureHeader} Header;
    uintptr_t[8] PlatformData;
}</code></pre>
 * 
 * <h3>Member documentation</h3>
 * 
 * <table class=lwjgl>
 * <tr><td>Header</td><td>API-independent header</td></tr>
 * <tr><td>PlatformData</td><td>specialized in {@link OVRGLTextureData}, {@code ovrD3D11TextureData} etc</td></tr>
 * </table>
 */
public class OVRTexture extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		HEADER,
		PLATFORMDATA;

	static {
		Layout layout = __struct(
			__member(OVRTextureHeader.SIZEOF, OVRTextureHeader.__ALIGNMENT),
			__array(POINTER_SIZE, 8)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		HEADER = layout.offsetof(0);
		PLATFORMDATA = layout.offsetof(1);
	}

	OVRTexture(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link OVRTexture} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRTexture(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link OVRTextureHeader} view of the {@code Header} field. */
	public OVRTextureHeader Header() { return nHeader(address()); }
	/** Returns a {@link PointerBuffer} view of the {@code PlatformData} field. */
	public PointerBuffer PlatformData() { return nPlatformData(address()); }
	/** Returns the value at the specified index of the {@code PlatformData} field. */
	public long PlatformData(int index) { return nPlatformData(address(), index); }

	/** Copies the specified {@link OVRTextureHeader} to the {@code Header} field. */
	public OVRTexture Header(OVRTextureHeader value) { nHeader(address(), value); return this; }
	/** Copies the specified {@link PointerBuffer} to the {@code PlatformData} field. */
	public OVRTexture PlatformData(PointerBuffer value) { nPlatformData(address(), value); return this; }
	/** Sets the specified value at the specified index of the {@code PlatformData} field. */
	public OVRTexture PlatformData(int index, long value) { nPlatformData(address(), index, value); return this; }

	/** Initializes this struct with the specified values. */
	public OVRTexture set(
		OVRTextureHeader Header,
		PointerBuffer PlatformData
	) {
		Header(Header);
		PlatformData(PlatformData);

		return this;
	}

	/** Unsafe version of {@link #set(OVRTexture) set}. */
	public OVRTexture nset(long struct) {
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
	public OVRTexture set(OVRTexture src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link OVRTexture} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static OVRTexture malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRTexture} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static OVRTexture calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRTexture} instance allocated with {@link BufferUtils}. */
	public static OVRTexture create() {
		return new OVRTexture(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link OVRTexture} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static OVRTexture create(long address) {
		return address == NULL ? null : new OVRTexture(address, null);
	}

	/**
	 * Returns a new {@link OVRTexture.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRTexture.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRTexture.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link OVRTexture.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #Header}. */
	public static OVRTextureHeader nHeader(long struct) { return OVRTextureHeader.create(struct + OVRTexture.HEADER); }
	/** Unsafe version of {@link #PlatformData}. */
	public static PointerBuffer nPlatformData(long struct) {
		return memPointerBuffer(struct + OVRTexture.PLATFORMDATA, 8);
	}
	/** Unsafe version of {@link #PlatformData(int) PlatformData}. */
	public static long nPlatformData(long struct, int index) { return memGetAddress(struct + OVRTexture.PLATFORMDATA + index * 2147483647); }

	/** Unsafe version of {@link #Header(OVRTextureHeader) Header}. */
	public static void nHeader(long struct, OVRTextureHeader value) { memCopy(value.address(), struct + OVRTexture.HEADER, OVRTextureHeader.SIZEOF); }
	/** Unsafe version of {@link #PlatformData(PointerBuffer) PlatformData}. */
	public static void nPlatformData(long struct, PointerBuffer value) {
		if ( CHECKS ) checkBufferGT(value, 8);
		memCopy(memAddress(value), struct + OVRTexture.PLATFORMDATA, value.remaining() * POINTER_SIZE);
	}
	/** Unsafe version of {@link #PlatformData(int, long) PlatformData}. */
	public static void nPlatformData(long struct, int index, long value) { memPutAddress(struct + OVRTexture.PLATFORMDATA + index * POINTER_SIZE, value); }

	// -----------------------------------

	/** An array of {@link OVRTexture} structs. */
	public static final class Buffer extends StructBuffer<OVRTexture, Buffer> {

		/**
		 * Creates a new {@link OVRTexture.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRTexture#SIZEOF}, and its mark will be undefined.
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
		protected OVRTexture newInstance(long address) {
			return new OVRTexture(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link OVRTextureHeader} view of the {@code Header} field. */
		public OVRTextureHeader Header() { return OVRTexture.nHeader(address()); }
		/** Returns a {@link PointerBuffer} view of the {@code PlatformData} field. */
		public PointerBuffer PlatformData() { return OVRTexture.nPlatformData(address()); }
		/** Returns the value at the specified index of the {@code PlatformData} field. */
		public long PlatformData(int index) { return OVRTexture.nPlatformData(address(), index); }

		/** Copies the specified {@link OVRTextureHeader} to the {@code Header} field. */
		public OVRTexture.Buffer Header(OVRTextureHeader value) { OVRTexture.nHeader(address(), value); return this; }
		/** Copies the specified {@link PointerBuffer} to the {@code PlatformData} field. */
		public OVRTexture.Buffer PlatformData(PointerBuffer value) { OVRTexture.nPlatformData(address(), value); return this; }
		/** Sets the specified value at the specified index of the {@code PlatformData} field. */
		public OVRTexture.Buffer PlatformData(int index, long value) { OVRTexture.nPlatformData(address(), index, value); return this; }

	}

}