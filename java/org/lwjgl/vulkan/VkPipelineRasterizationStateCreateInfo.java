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
import static org.lwjgl.system.MemoryStack.*;

/**
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkPipelineRasterizationStateCreateInfo.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkPipelineRasterizationStateCreateInfo">Vulkan Specification</a>
 * 
 * <p>Contains information about rasterization as part of graphics pipeline creation.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>{@code polygonMode} <b>must</b> be a valid {@code VkPolygonMode} value</li>
 * <li>{@code cullMode} <b>must</b> be a valid combination of {@code VkCullModeFlagBits} values</li>
 * <li>{@code frontFace} <b>must</b> be a valid {@code VkFrontFace} value</li>
 * <li>If the depth clamping feature is not enabled, {@code depthClampEnable} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
 * <li>If the non-solid fill modes feature is not enabled, {@code polygonMode} <b>must</b> be {@link VK10#VK_POLYGON_MODE_FILL POLYGON_MODE_FILL}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure. Must be: {@link VK10#VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO}</li>
 * <li>{@code pNext} &ndash; reserved for use by extensions</li>
 * <li>{@code flags} &ndash; reserved for future use</li>
 * <li>{@code depthClampEnable} &ndash; controls whether to clamp the fragment’s depth values instead of clipping primitives to the z planes of the frustum</li>
 * <li>{@code rasterizerDiscardEnable} &ndash; controls whether primitives are discarded immediately before the rasterization stage</li>
 * <li>{@code polygonMode} &ndash; the triangle rendering mode. One of:<br><table><tr><td>{@link VK10#VK_POLYGON_MODE_FILL POLYGON_MODE_FILL}</td><td>{@link VK10#VK_POLYGON_MODE_LINE POLYGON_MODE_LINE}</td><td>{@link VK10#VK_POLYGON_MODE_POINT POLYGON_MODE_POINT}</td></tr></table></li>
 * <li>{@code cullMode} &ndash; the triangle facing direction used for primitive culling. One of:<br><table><tr><td>{@link VK10#VK_CULL_MODE_BACK_BIT CULL_MODE_BACK_BIT}</td><td>{@link VK10#VK_CULL_MODE_FRONT_AND_BACK CULL_MODE_FRONT_AND_BACK}</td><td>{@link VK10#VK_CULL_MODE_FRONT_BIT CULL_MODE_FRONT_BIT}</td><td>{@link VK10#VK_CULL_MODE_NONE CULL_MODE_NONE}</td></tr></table></li>
 * <li>{@code frontFace} &ndash; the front-facing triangle orientation to be used for culling. One of:<br><table><tr><td>{@link VK10#VK_FRONT_FACE_CLOCKWISE FRONT_FACE_CLOCKWISE}</td><td>{@link VK10#VK_FRONT_FACE_COUNTER_CLOCKWISE FRONT_FACE_COUNTER_CLOCKWISE}</td></tr></table></li>
 * <li>{@code depthBiasEnable} &ndash; controls whether to bias fragment depth values</li>
 * <li>{@code depthBiasConstantFactor} &ndash; a scalar factor controlling the constant depth value added to each fragment</li>
 * <li>{@code depthBiasClamp} &ndash; the maximum (or minimum) depth bias of a fragment</li>
 * <li>{@code depthBiasSlopeFactor} &ndash; a scalar factor applied to a fragment’s slope in depth bias calculations</li>
 * <li>{@code lineWidth} &ndash; the width of rasterized line segments</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkPipelineRasterizationStateCreateInfo {
    VkStructureType sType;
    const void * pNext;
    VkPipelineRasterizationStateCreateFlags flags;
    VkBool32 depthClampEnable;
    VkBool32 rasterizerDiscardEnable;
    VkPolygonMode polygonMode;
    VkCullModeFlags cullMode;
    VkFrontFace frontFace;
    VkBool32 depthBiasEnable;
    float depthBiasConstantFactor;
    float depthBiasClamp;
    float depthBiasSlopeFactor;
    float lineWidth;
}</code></pre>
 */
public class VkPipelineRasterizationStateCreateInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		FLAGS,
		DEPTHCLAMPENABLE,
		RASTERIZERDISCARDENABLE,
		POLYGONMODE,
		CULLMODE,
		FRONTFACE,
		DEPTHBIASENABLE,
		DEPTHBIASCONSTANTFACTOR,
		DEPTHBIASCLAMP,
		DEPTHBIASSLOPEFACTOR,
		LINEWIDTH;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(4),
			__member(4),
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

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		FLAGS = layout.offsetof(2);
		DEPTHCLAMPENABLE = layout.offsetof(3);
		RASTERIZERDISCARDENABLE = layout.offsetof(4);
		POLYGONMODE = layout.offsetof(5);
		CULLMODE = layout.offsetof(6);
		FRONTFACE = layout.offsetof(7);
		DEPTHBIASENABLE = layout.offsetof(8);
		DEPTHBIASCONSTANTFACTOR = layout.offsetof(9);
		DEPTHBIASCLAMP = layout.offsetof(10);
		DEPTHBIASSLOPEFACTOR = layout.offsetof(11);
		LINEWIDTH = layout.offsetof(12);
	}

	VkPipelineRasterizationStateCreateInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkPipelineRasterizationStateCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkPipelineRasterizationStateCreateInfo(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code sType} field. */
	public int sType() { return nsType(address()); }
	/** Returns the value of the {@code pNext} field. */
	public long pNext() { return npNext(address()); }
	/** Returns the value of the {@code flags} field. */
	public int flags() { return nflags(address()); }
	/** Returns the value of the {@code depthClampEnable} field. */
	public int depthClampEnable() { return ndepthClampEnable(address()); }
	/** Returns the value of the {@code rasterizerDiscardEnable} field. */
	public int rasterizerDiscardEnable() { return nrasterizerDiscardEnable(address()); }
	/** Returns the value of the {@code polygonMode} field. */
	public int polygonMode() { return npolygonMode(address()); }
	/** Returns the value of the {@code cullMode} field. */
	public int cullMode() { return ncullMode(address()); }
	/** Returns the value of the {@code frontFace} field. */
	public int frontFace() { return nfrontFace(address()); }
	/** Returns the value of the {@code depthBiasEnable} field. */
	public int depthBiasEnable() { return ndepthBiasEnable(address()); }
	/** Returns the value of the {@code depthBiasConstantFactor} field. */
	public float depthBiasConstantFactor() { return ndepthBiasConstantFactor(address()); }
	/** Returns the value of the {@code depthBiasClamp} field. */
	public float depthBiasClamp() { return ndepthBiasClamp(address()); }
	/** Returns the value of the {@code depthBiasSlopeFactor} field. */
	public float depthBiasSlopeFactor() { return ndepthBiasSlopeFactor(address()); }
	/** Returns the value of the {@code lineWidth} field. */
	public float lineWidth() { return nlineWidth(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkPipelineRasterizationStateCreateInfo sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkPipelineRasterizationStateCreateInfo pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkPipelineRasterizationStateCreateInfo flags(int value) { nflags(address(), value); return this; }
	/** Sets the specified value to the {@code depthClampEnable} field. */
	public VkPipelineRasterizationStateCreateInfo depthClampEnable(int value) { ndepthClampEnable(address(), value); return this; }
	/** Sets the specified value to the {@code rasterizerDiscardEnable} field. */
	public VkPipelineRasterizationStateCreateInfo rasterizerDiscardEnable(int value) { nrasterizerDiscardEnable(address(), value); return this; }
	/** Sets the specified value to the {@code polygonMode} field. */
	public VkPipelineRasterizationStateCreateInfo polygonMode(int value) { npolygonMode(address(), value); return this; }
	/** Sets the specified value to the {@code cullMode} field. */
	public VkPipelineRasterizationStateCreateInfo cullMode(int value) { ncullMode(address(), value); return this; }
	/** Sets the specified value to the {@code frontFace} field. */
	public VkPipelineRasterizationStateCreateInfo frontFace(int value) { nfrontFace(address(), value); return this; }
	/** Sets the specified value to the {@code depthBiasEnable} field. */
	public VkPipelineRasterizationStateCreateInfo depthBiasEnable(int value) { ndepthBiasEnable(address(), value); return this; }
	/** Sets the specified value to the {@code depthBiasConstantFactor} field. */
	public VkPipelineRasterizationStateCreateInfo depthBiasConstantFactor(float value) { ndepthBiasConstantFactor(address(), value); return this; }
	/** Sets the specified value to the {@code depthBiasClamp} field. */
	public VkPipelineRasterizationStateCreateInfo depthBiasClamp(float value) { ndepthBiasClamp(address(), value); return this; }
	/** Sets the specified value to the {@code depthBiasSlopeFactor} field. */
	public VkPipelineRasterizationStateCreateInfo depthBiasSlopeFactor(float value) { ndepthBiasSlopeFactor(address(), value); return this; }
	/** Sets the specified value to the {@code lineWidth} field. */
	public VkPipelineRasterizationStateCreateInfo lineWidth(float value) { nlineWidth(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkPipelineRasterizationStateCreateInfo set(
		int sType,
		long pNext,
		int flags,
		int depthClampEnable,
		int rasterizerDiscardEnable,
		int polygonMode,
		int cullMode,
		int frontFace,
		int depthBiasEnable,
		float depthBiasConstantFactor,
		float depthBiasClamp,
		float depthBiasSlopeFactor,
		float lineWidth
	) {
		sType(sType);
		pNext(pNext);
		flags(flags);
		depthClampEnable(depthClampEnable);
		rasterizerDiscardEnable(rasterizerDiscardEnable);
		polygonMode(polygonMode);
		cullMode(cullMode);
		frontFace(frontFace);
		depthBiasEnable(depthBiasEnable);
		depthBiasConstantFactor(depthBiasConstantFactor);
		depthBiasClamp(depthBiasClamp);
		depthBiasSlopeFactor(depthBiasSlopeFactor);
		lineWidth(lineWidth);

		return this;
	}

	/** Unsafe version of {@link #set(VkPipelineRasterizationStateCreateInfo) set}. */
	public VkPipelineRasterizationStateCreateInfo nset(long struct) {
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
	public VkPipelineRasterizationStateCreateInfo set(VkPipelineRasterizationStateCreateInfo src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkPipelineRasterizationStateCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkPipelineRasterizationStateCreateInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkPipelineRasterizationStateCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkPipelineRasterizationStateCreateInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkPipelineRasterizationStateCreateInfo} instance allocated with {@link BufferUtils}. */
	public static VkPipelineRasterizationStateCreateInfo create() {
		return new VkPipelineRasterizationStateCreateInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkPipelineRasterizationStateCreateInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkPipelineRasterizationStateCreateInfo create(long address) {
		return address == NULL ? null : new VkPipelineRasterizationStateCreateInfo(address, null);
	}

	/**
	 * Returns a new {@link VkPipelineRasterizationStateCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPipelineRasterizationStateCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPipelineRasterizationStateCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkPipelineRasterizationStateCreateInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkPipelineRasterizationStateCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkPipelineRasterizationStateCreateInfo mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkPipelineRasterizationStateCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkPipelineRasterizationStateCreateInfo callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkPipelineRasterizationStateCreateInfo} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkPipelineRasterizationStateCreateInfo mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkPipelineRasterizationStateCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkPipelineRasterizationStateCreateInfo callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkPipelineRasterizationStateCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkPipelineRasterizationStateCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkPipelineRasterizationStateCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPipelineRasterizationStateCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkPipelineRasterizationStateCreateInfo.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkPipelineRasterizationStateCreateInfo.PNEXT); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkPipelineRasterizationStateCreateInfo.FLAGS); }
	/** Unsafe version of {@link #depthClampEnable}. */
	public static int ndepthClampEnable(long struct) { return memGetInt(struct + VkPipelineRasterizationStateCreateInfo.DEPTHCLAMPENABLE); }
	/** Unsafe version of {@link #rasterizerDiscardEnable}. */
	public static int nrasterizerDiscardEnable(long struct) { return memGetInt(struct + VkPipelineRasterizationStateCreateInfo.RASTERIZERDISCARDENABLE); }
	/** Unsafe version of {@link #polygonMode}. */
	public static int npolygonMode(long struct) { return memGetInt(struct + VkPipelineRasterizationStateCreateInfo.POLYGONMODE); }
	/** Unsafe version of {@link #cullMode}. */
	public static int ncullMode(long struct) { return memGetInt(struct + VkPipelineRasterizationStateCreateInfo.CULLMODE); }
	/** Unsafe version of {@link #frontFace}. */
	public static int nfrontFace(long struct) { return memGetInt(struct + VkPipelineRasterizationStateCreateInfo.FRONTFACE); }
	/** Unsafe version of {@link #depthBiasEnable}. */
	public static int ndepthBiasEnable(long struct) { return memGetInt(struct + VkPipelineRasterizationStateCreateInfo.DEPTHBIASENABLE); }
	/** Unsafe version of {@link #depthBiasConstantFactor}. */
	public static float ndepthBiasConstantFactor(long struct) { return memGetFloat(struct + VkPipelineRasterizationStateCreateInfo.DEPTHBIASCONSTANTFACTOR); }
	/** Unsafe version of {@link #depthBiasClamp}. */
	public static float ndepthBiasClamp(long struct) { return memGetFloat(struct + VkPipelineRasterizationStateCreateInfo.DEPTHBIASCLAMP); }
	/** Unsafe version of {@link #depthBiasSlopeFactor}. */
	public static float ndepthBiasSlopeFactor(long struct) { return memGetFloat(struct + VkPipelineRasterizationStateCreateInfo.DEPTHBIASSLOPEFACTOR); }
	/** Unsafe version of {@link #lineWidth}. */
	public static float nlineWidth(long struct) { return memGetFloat(struct + VkPipelineRasterizationStateCreateInfo.LINEWIDTH); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineRasterizationStateCreateInfo.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineRasterizationStateCreateInfo.PNEXT, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkPipelineRasterizationStateCreateInfo.FLAGS, value); }
	/** Unsafe version of {@link #depthClampEnable(int) depthClampEnable}. */
	public static void ndepthClampEnable(long struct, int value) { memPutInt(struct + VkPipelineRasterizationStateCreateInfo.DEPTHCLAMPENABLE, value); }
	/** Unsafe version of {@link #rasterizerDiscardEnable(int) rasterizerDiscardEnable}. */
	public static void nrasterizerDiscardEnable(long struct, int value) { memPutInt(struct + VkPipelineRasterizationStateCreateInfo.RASTERIZERDISCARDENABLE, value); }
	/** Unsafe version of {@link #polygonMode(int) polygonMode}. */
	public static void npolygonMode(long struct, int value) { memPutInt(struct + VkPipelineRasterizationStateCreateInfo.POLYGONMODE, value); }
	/** Unsafe version of {@link #cullMode(int) cullMode}. */
	public static void ncullMode(long struct, int value) { memPutInt(struct + VkPipelineRasterizationStateCreateInfo.CULLMODE, value); }
	/** Unsafe version of {@link #frontFace(int) frontFace}. */
	public static void nfrontFace(long struct, int value) { memPutInt(struct + VkPipelineRasterizationStateCreateInfo.FRONTFACE, value); }
	/** Unsafe version of {@link #depthBiasEnable(int) depthBiasEnable}. */
	public static void ndepthBiasEnable(long struct, int value) { memPutInt(struct + VkPipelineRasterizationStateCreateInfo.DEPTHBIASENABLE, value); }
	/** Unsafe version of {@link #depthBiasConstantFactor(float) depthBiasConstantFactor}. */
	public static void ndepthBiasConstantFactor(long struct, float value) { memPutFloat(struct + VkPipelineRasterizationStateCreateInfo.DEPTHBIASCONSTANTFACTOR, value); }
	/** Unsafe version of {@link #depthBiasClamp(float) depthBiasClamp}. */
	public static void ndepthBiasClamp(long struct, float value) { memPutFloat(struct + VkPipelineRasterizationStateCreateInfo.DEPTHBIASCLAMP, value); }
	/** Unsafe version of {@link #depthBiasSlopeFactor(float) depthBiasSlopeFactor}. */
	public static void ndepthBiasSlopeFactor(long struct, float value) { memPutFloat(struct + VkPipelineRasterizationStateCreateInfo.DEPTHBIASSLOPEFACTOR, value); }
	/** Unsafe version of {@link #lineWidth(float) lineWidth}. */
	public static void nlineWidth(long struct, float value) { memPutFloat(struct + VkPipelineRasterizationStateCreateInfo.LINEWIDTH, value); }

	// -----------------------------------

	/** An array of {@link VkPipelineRasterizationStateCreateInfo} structs. */
	public static final class Buffer extends StructBuffer<VkPipelineRasterizationStateCreateInfo, Buffer> {

		/**
		 * Creates a new {@link VkPipelineRasterizationStateCreateInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkPipelineRasterizationStateCreateInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkPipelineRasterizationStateCreateInfo newInstance(long address) {
			return new VkPipelineRasterizationStateCreateInfo(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkPipelineRasterizationStateCreateInfo.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkPipelineRasterizationStateCreateInfo.npNext(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkPipelineRasterizationStateCreateInfo.nflags(address()); }
		/** Returns the value of the {@code depthClampEnable} field. */
		public int depthClampEnable() { return VkPipelineRasterizationStateCreateInfo.ndepthClampEnable(address()); }
		/** Returns the value of the {@code rasterizerDiscardEnable} field. */
		public int rasterizerDiscardEnable() { return VkPipelineRasterizationStateCreateInfo.nrasterizerDiscardEnable(address()); }
		/** Returns the value of the {@code polygonMode} field. */
		public int polygonMode() { return VkPipelineRasterizationStateCreateInfo.npolygonMode(address()); }
		/** Returns the value of the {@code cullMode} field. */
		public int cullMode() { return VkPipelineRasterizationStateCreateInfo.ncullMode(address()); }
		/** Returns the value of the {@code frontFace} field. */
		public int frontFace() { return VkPipelineRasterizationStateCreateInfo.nfrontFace(address()); }
		/** Returns the value of the {@code depthBiasEnable} field. */
		public int depthBiasEnable() { return VkPipelineRasterizationStateCreateInfo.ndepthBiasEnable(address()); }
		/** Returns the value of the {@code depthBiasConstantFactor} field. */
		public float depthBiasConstantFactor() { return VkPipelineRasterizationStateCreateInfo.ndepthBiasConstantFactor(address()); }
		/** Returns the value of the {@code depthBiasClamp} field. */
		public float depthBiasClamp() { return VkPipelineRasterizationStateCreateInfo.ndepthBiasClamp(address()); }
		/** Returns the value of the {@code depthBiasSlopeFactor} field. */
		public float depthBiasSlopeFactor() { return VkPipelineRasterizationStateCreateInfo.ndepthBiasSlopeFactor(address()); }
		/** Returns the value of the {@code lineWidth} field. */
		public float lineWidth() { return VkPipelineRasterizationStateCreateInfo.nlineWidth(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkPipelineRasterizationStateCreateInfo.Buffer sType(int value) { VkPipelineRasterizationStateCreateInfo.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkPipelineRasterizationStateCreateInfo.Buffer pNext(long value) { VkPipelineRasterizationStateCreateInfo.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkPipelineRasterizationStateCreateInfo.Buffer flags(int value) { VkPipelineRasterizationStateCreateInfo.nflags(address(), value); return this; }
		/** Sets the specified value to the {@code depthClampEnable} field. */
		public VkPipelineRasterizationStateCreateInfo.Buffer depthClampEnable(int value) { VkPipelineRasterizationStateCreateInfo.ndepthClampEnable(address(), value); return this; }
		/** Sets the specified value to the {@code rasterizerDiscardEnable} field. */
		public VkPipelineRasterizationStateCreateInfo.Buffer rasterizerDiscardEnable(int value) { VkPipelineRasterizationStateCreateInfo.nrasterizerDiscardEnable(address(), value); return this; }
		/** Sets the specified value to the {@code polygonMode} field. */
		public VkPipelineRasterizationStateCreateInfo.Buffer polygonMode(int value) { VkPipelineRasterizationStateCreateInfo.npolygonMode(address(), value); return this; }
		/** Sets the specified value to the {@code cullMode} field. */
		public VkPipelineRasterizationStateCreateInfo.Buffer cullMode(int value) { VkPipelineRasterizationStateCreateInfo.ncullMode(address(), value); return this; }
		/** Sets the specified value to the {@code frontFace} field. */
		public VkPipelineRasterizationStateCreateInfo.Buffer frontFace(int value) { VkPipelineRasterizationStateCreateInfo.nfrontFace(address(), value); return this; }
		/** Sets the specified value to the {@code depthBiasEnable} field. */
		public VkPipelineRasterizationStateCreateInfo.Buffer depthBiasEnable(int value) { VkPipelineRasterizationStateCreateInfo.ndepthBiasEnable(address(), value); return this; }
		/** Sets the specified value to the {@code depthBiasConstantFactor} field. */
		public VkPipelineRasterizationStateCreateInfo.Buffer depthBiasConstantFactor(float value) { VkPipelineRasterizationStateCreateInfo.ndepthBiasConstantFactor(address(), value); return this; }
		/** Sets the specified value to the {@code depthBiasClamp} field. */
		public VkPipelineRasterizationStateCreateInfo.Buffer depthBiasClamp(float value) { VkPipelineRasterizationStateCreateInfo.ndepthBiasClamp(address(), value); return this; }
		/** Sets the specified value to the {@code depthBiasSlopeFactor} field. */
		public VkPipelineRasterizationStateCreateInfo.Buffer depthBiasSlopeFactor(float value) { VkPipelineRasterizationStateCreateInfo.ndepthBiasSlopeFactor(address(), value); return this; }
		/** Sets the specified value to the {@code lineWidth} field. */
		public VkPipelineRasterizationStateCreateInfo.Buffer lineWidth(float value) { VkPipelineRasterizationStateCreateInfo.nlineWidth(address(), value); return this; }

	}

}