/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Description used to create a texture swap chain.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code ArraySize} &ndash; only supported with {@link OVR#ovrTexture_2D Texture_2D}. Not supported on PC at this time.</li>
 * <li>{@code SampleCount} &ndash; current only supported on depth textures</li>
 * <li>{@code StaticImage} &ndash; not buffered in a chain. For images that don't change</li>
 * <li>{@code MiscFlags} &ndash; {@code ovrTextureFlags}. One or more of:<br><table><tr><td>{@link OVR#ovrTextureMisc_None TextureMisc_None}</td><td>{@link OVR#ovrTextureMisc_DX_Typeless TextureMisc_DX_Typeless}</td><td>{@link OVR#ovrTextureMisc_AllowGenerateMips TextureMisc_AllowGenerateMips}</td></tr><tr><td>{@link OVR#ovrTextureMisc_ProtectedContent TextureMisc_ProtectedContent}</td></tr></table></li>
 * <li>{@code BindFlags} &ndash; {@code ovrTextureBindFlags}. Not used for GL. One or more of:<br><table><tr><td>{@link OVR#ovrTextureBind_None TextureBind_None}</td><td>{@link OVR#ovrTextureBind_DX_RenderTarget TextureBind_DX_RenderTarget}</td><td>{@link OVR#ovrTextureBind_DX_UnorderedAccess TextureBind_DX_UnorderedAccess}</td></tr><tr><td>{@link OVR#ovrTextureBind_DX_DepthStencil TextureBind_DX_DepthStencil}</td></tr></table></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct ovrTextureSwapChainDesc {
    ovrTextureType Type;
    ovrTextureFormat Format;
    int ArraySize;
    int Width;
    int Height;
    int MipLevels;
    int SampleCount;
    ovrBool StaticImage;
    unsigned int MiscFlags;
    unsigned int BindFlags;
}</code></pre>
 */
public class OVRTextureSwapChainDesc extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		TYPE,
		FORMAT,
		ARRAYSIZE,
		WIDTH,
		HEIGHT,
		MIPLEVELS,
		SAMPLECOUNT,
		STATICIMAGE,
		MISCFLAGS,
		BINDFLAGS;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(1),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		TYPE = layout.offsetof(0);
		FORMAT = layout.offsetof(1);
		ARRAYSIZE = layout.offsetof(2);
		WIDTH = layout.offsetof(3);
		HEIGHT = layout.offsetof(4);
		MIPLEVELS = layout.offsetof(5);
		SAMPLECOUNT = layout.offsetof(6);
		STATICIMAGE = layout.offsetof(7);
		MISCFLAGS = layout.offsetof(8);
		BINDFLAGS = layout.offsetof(9);
	}

	OVRTextureSwapChainDesc(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link OVRTextureSwapChainDesc} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRTextureSwapChainDesc(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code Type} field. */
	public int Type() { return nType(address()); }
	/** Returns the value of the {@code Format} field. */
	public int Format() { return nFormat(address()); }
	/** Returns the value of the {@code ArraySize} field. */
	public int ArraySize() { return nArraySize(address()); }
	/** Returns the value of the {@code Width} field. */
	public int Width() { return nWidth(address()); }
	/** Returns the value of the {@code Height} field. */
	public int Height() { return nHeight(address()); }
	/** Returns the value of the {@code MipLevels} field. */
	public int MipLevels() { return nMipLevels(address()); }
	/** Returns the value of the {@code SampleCount} field. */
	public int SampleCount() { return nSampleCount(address()); }
	/** Returns the value of the {@code StaticImage} field. */
	public boolean StaticImage() { return nStaticImage(address()); }
	/** Returns the value of the {@code MiscFlags} field. */
	public int MiscFlags() { return nMiscFlags(address()); }
	/** Returns the value of the {@code BindFlags} field. */
	public int BindFlags() { return nBindFlags(address()); }

	/** Sets the specified value to the {@code Type} field. */
	public OVRTextureSwapChainDesc Type(int value) { nType(address(), value); return this; }
	/** Sets the specified value to the {@code Format} field. */
	public OVRTextureSwapChainDesc Format(int value) { nFormat(address(), value); return this; }
	/** Sets the specified value to the {@code ArraySize} field. */
	public OVRTextureSwapChainDesc ArraySize(int value) { nArraySize(address(), value); return this; }
	/** Sets the specified value to the {@code Width} field. */
	public OVRTextureSwapChainDesc Width(int value) { nWidth(address(), value); return this; }
	/** Sets the specified value to the {@code Height} field. */
	public OVRTextureSwapChainDesc Height(int value) { nHeight(address(), value); return this; }
	/** Sets the specified value to the {@code MipLevels} field. */
	public OVRTextureSwapChainDesc MipLevels(int value) { nMipLevels(address(), value); return this; }
	/** Sets the specified value to the {@code SampleCount} field. */
	public OVRTextureSwapChainDesc SampleCount(int value) { nSampleCount(address(), value); return this; }
	/** Sets the specified value to the {@code StaticImage} field. */
	public OVRTextureSwapChainDesc StaticImage(boolean value) { nStaticImage(address(), value); return this; }
	/** Sets the specified value to the {@code MiscFlags} field. */
	public OVRTextureSwapChainDesc MiscFlags(int value) { nMiscFlags(address(), value); return this; }
	/** Sets the specified value to the {@code BindFlags} field. */
	public OVRTextureSwapChainDesc BindFlags(int value) { nBindFlags(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public OVRTextureSwapChainDesc set(
		int Type,
		int Format,
		int ArraySize,
		int Width,
		int Height,
		int MipLevels,
		int SampleCount,
		boolean StaticImage,
		int MiscFlags,
		int BindFlags
	) {
		Type(Type);
		Format(Format);
		ArraySize(ArraySize);
		Width(Width);
		Height(Height);
		MipLevels(MipLevels);
		SampleCount(SampleCount);
		StaticImage(StaticImage);
		MiscFlags(MiscFlags);
		BindFlags(BindFlags);

		return this;
	}

	/** Unsafe version of {@link #set(OVRTextureSwapChainDesc) set}. */
	public OVRTextureSwapChainDesc nset(long struct) {
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
	public OVRTextureSwapChainDesc set(OVRTextureSwapChainDesc src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link OVRTextureSwapChainDesc} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static OVRTextureSwapChainDesc malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRTextureSwapChainDesc} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static OVRTextureSwapChainDesc calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRTextureSwapChainDesc} instance allocated with {@link BufferUtils}. */
	public static OVRTextureSwapChainDesc create() {
		return new OVRTextureSwapChainDesc(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link OVRTextureSwapChainDesc} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static OVRTextureSwapChainDesc create(long address) {
		return address == NULL ? null : new OVRTextureSwapChainDesc(address, null);
	}

	/**
	 * Returns a new {@link OVRTextureSwapChainDesc.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRTextureSwapChainDesc.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRTextureSwapChainDesc.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link OVRTextureSwapChainDesc.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link OVRTextureSwapChainDesc} instance allocated on the thread-local {@link MemoryStack}. */
	public static OVRTextureSwapChainDesc mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link OVRTextureSwapChainDesc} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static OVRTextureSwapChainDesc callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link OVRTextureSwapChainDesc} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static OVRTextureSwapChainDesc mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRTextureSwapChainDesc} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static OVRTextureSwapChainDesc callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRTextureSwapChainDesc.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link OVRTextureSwapChainDesc.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link OVRTextureSwapChainDesc.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRTextureSwapChainDesc.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #Type}. */
	public static int nType(long struct) { return memGetInt(struct + OVRTextureSwapChainDesc.TYPE); }
	/** Unsafe version of {@link #Format}. */
	public static int nFormat(long struct) { return memGetInt(struct + OVRTextureSwapChainDesc.FORMAT); }
	/** Unsafe version of {@link #ArraySize}. */
	public static int nArraySize(long struct) { return memGetInt(struct + OVRTextureSwapChainDesc.ARRAYSIZE); }
	/** Unsafe version of {@link #Width}. */
	public static int nWidth(long struct) { return memGetInt(struct + OVRTextureSwapChainDesc.WIDTH); }
	/** Unsafe version of {@link #Height}. */
	public static int nHeight(long struct) { return memGetInt(struct + OVRTextureSwapChainDesc.HEIGHT); }
	/** Unsafe version of {@link #MipLevels}. */
	public static int nMipLevels(long struct) { return memGetInt(struct + OVRTextureSwapChainDesc.MIPLEVELS); }
	/** Unsafe version of {@link #SampleCount}. */
	public static int nSampleCount(long struct) { return memGetInt(struct + OVRTextureSwapChainDesc.SAMPLECOUNT); }
	/** Unsafe version of {@link #StaticImage}. */
	public static boolean nStaticImage(long struct) { return memGetByte(struct + OVRTextureSwapChainDesc.STATICIMAGE) != 0; }
	/** Unsafe version of {@link #MiscFlags}. */
	public static int nMiscFlags(long struct) { return memGetInt(struct + OVRTextureSwapChainDesc.MISCFLAGS); }
	/** Unsafe version of {@link #BindFlags}. */
	public static int nBindFlags(long struct) { return memGetInt(struct + OVRTextureSwapChainDesc.BINDFLAGS); }

	/** Unsafe version of {@link #Type(int) Type}. */
	public static void nType(long struct, int value) { memPutInt(struct + OVRTextureSwapChainDesc.TYPE, value); }
	/** Unsafe version of {@link #Format(int) Format}. */
	public static void nFormat(long struct, int value) { memPutInt(struct + OVRTextureSwapChainDesc.FORMAT, value); }
	/** Unsafe version of {@link #ArraySize(int) ArraySize}. */
	public static void nArraySize(long struct, int value) { memPutInt(struct + OVRTextureSwapChainDesc.ARRAYSIZE, value); }
	/** Unsafe version of {@link #Width(int) Width}. */
	public static void nWidth(long struct, int value) { memPutInt(struct + OVRTextureSwapChainDesc.WIDTH, value); }
	/** Unsafe version of {@link #Height(int) Height}. */
	public static void nHeight(long struct, int value) { memPutInt(struct + OVRTextureSwapChainDesc.HEIGHT, value); }
	/** Unsafe version of {@link #MipLevels(int) MipLevels}. */
	public static void nMipLevels(long struct, int value) { memPutInt(struct + OVRTextureSwapChainDesc.MIPLEVELS, value); }
	/** Unsafe version of {@link #SampleCount(int) SampleCount}. */
	public static void nSampleCount(long struct, int value) { memPutInt(struct + OVRTextureSwapChainDesc.SAMPLECOUNT, value); }
	/** Unsafe version of {@link #StaticImage(boolean) StaticImage}. */
	public static void nStaticImage(long struct, boolean value) { memPutByte(struct + OVRTextureSwapChainDesc.STATICIMAGE, value ? (byte)1 : (byte)0); }
	/** Unsafe version of {@link #MiscFlags(int) MiscFlags}. */
	public static void nMiscFlags(long struct, int value) { memPutInt(struct + OVRTextureSwapChainDesc.MISCFLAGS, value); }
	/** Unsafe version of {@link #BindFlags(int) BindFlags}. */
	public static void nBindFlags(long struct, int value) { memPutInt(struct + OVRTextureSwapChainDesc.BINDFLAGS, value); }

	// -----------------------------------

	/** An array of {@link OVRTextureSwapChainDesc} structs. */
	public static class Buffer extends StructBuffer<OVRTextureSwapChainDesc, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link OVRTextureSwapChainDesc.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRTextureSwapChainDesc#SIZEOF}, and its mark will be undefined.
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
		protected OVRTextureSwapChainDesc newInstance(long address) {
			return new OVRTextureSwapChainDesc(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code Type} field. */
		public int Type() { return OVRTextureSwapChainDesc.nType(address()); }
		/** Returns the value of the {@code Format} field. */
		public int Format() { return OVRTextureSwapChainDesc.nFormat(address()); }
		/** Returns the value of the {@code ArraySize} field. */
		public int ArraySize() { return OVRTextureSwapChainDesc.nArraySize(address()); }
		/** Returns the value of the {@code Width} field. */
		public int Width() { return OVRTextureSwapChainDesc.nWidth(address()); }
		/** Returns the value of the {@code Height} field. */
		public int Height() { return OVRTextureSwapChainDesc.nHeight(address()); }
		/** Returns the value of the {@code MipLevels} field. */
		public int MipLevels() { return OVRTextureSwapChainDesc.nMipLevels(address()); }
		/** Returns the value of the {@code SampleCount} field. */
		public int SampleCount() { return OVRTextureSwapChainDesc.nSampleCount(address()); }
		/** Returns the value of the {@code StaticImage} field. */
		public boolean StaticImage() { return OVRTextureSwapChainDesc.nStaticImage(address()); }
		/** Returns the value of the {@code MiscFlags} field. */
		public int MiscFlags() { return OVRTextureSwapChainDesc.nMiscFlags(address()); }
		/** Returns the value of the {@code BindFlags} field. */
		public int BindFlags() { return OVRTextureSwapChainDesc.nBindFlags(address()); }

		/** Sets the specified value to the {@code Type} field. */
		public OVRTextureSwapChainDesc.Buffer Type(int value) { OVRTextureSwapChainDesc.nType(address(), value); return this; }
		/** Sets the specified value to the {@code Format} field. */
		public OVRTextureSwapChainDesc.Buffer Format(int value) { OVRTextureSwapChainDesc.nFormat(address(), value); return this; }
		/** Sets the specified value to the {@code ArraySize} field. */
		public OVRTextureSwapChainDesc.Buffer ArraySize(int value) { OVRTextureSwapChainDesc.nArraySize(address(), value); return this; }
		/** Sets the specified value to the {@code Width} field. */
		public OVRTextureSwapChainDesc.Buffer Width(int value) { OVRTextureSwapChainDesc.nWidth(address(), value); return this; }
		/** Sets the specified value to the {@code Height} field. */
		public OVRTextureSwapChainDesc.Buffer Height(int value) { OVRTextureSwapChainDesc.nHeight(address(), value); return this; }
		/** Sets the specified value to the {@code MipLevels} field. */
		public OVRTextureSwapChainDesc.Buffer MipLevels(int value) { OVRTextureSwapChainDesc.nMipLevels(address(), value); return this; }
		/** Sets the specified value to the {@code SampleCount} field. */
		public OVRTextureSwapChainDesc.Buffer SampleCount(int value) { OVRTextureSwapChainDesc.nSampleCount(address(), value); return this; }
		/** Sets the specified value to the {@code StaticImage} field. */
		public OVRTextureSwapChainDesc.Buffer StaticImage(boolean value) { OVRTextureSwapChainDesc.nStaticImage(address(), value); return this; }
		/** Sets the specified value to the {@code MiscFlags} field. */
		public OVRTextureSwapChainDesc.Buffer MiscFlags(int value) { OVRTextureSwapChainDesc.nMiscFlags(address(), value); return this; }
		/** Sets the specified value to the {@code BindFlags} field. */
		public OVRTextureSwapChainDesc.Buffer BindFlags(int value) { OVRTextureSwapChainDesc.nBindFlags(address(), value); return this; }

	}

}