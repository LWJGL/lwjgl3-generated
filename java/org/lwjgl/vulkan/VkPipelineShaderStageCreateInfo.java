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
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkPipelineShaderStageCreateInfo.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkPipelineShaderStageCreateInfo">Vulkan Specification</a>
 * 
 * <p>Contains information about how a shader stage should be created.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>{@code stage} <b>must</b> be a valid {@code VkShaderStageFlagBits} value</li>
 * <li>{@code module} <b>must</b> be a valid {@code VkShaderModule} handle</li>
 * <li>{@code pName} <b>must</b> be a null-terminated string</li>
 * <li>If {@code pSpecializationInfo} is not {@code NULL}, {@code pSpecializationInfo} <b>must</b> be a pointer to a valid {@link VkSpecializationInfo} structure</li>
 * <li>If the geometry shaders feature is not enabled, {@code stage} <b>must not</b> be {@link VK10#VK_SHADER_STAGE_GEOMETRY_BIT SHADER_STAGE_GEOMETRY_BIT}</li>
 * <li>If the tessellation shaders feature is not enabled, {@code stage} <b>must not</b> be {@link VK10#VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT SHADER_STAGE_TESSELLATION_CONTROL_BIT} or
 * {@link VK10#VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT SHADER_STAGE_TESSELLATION_EVALUATION_BIT}</li>
 * <li>{@code stage} <b>must not</b> be {@link VK10#VK_SHADER_STAGE_ALL_GRAPHICS SHADER_STAGE_ALL_GRAPHICS}, or {@link VK10#VK_SHADER_STAGE_ALL SHADER_STAGE_ALL}</li>
 * <li>{@code pName} <b>must</b> be the name of an {@code OpEntryPoint} in {@code module} with an execution model that matches {@code stage}</li>
 * <li>If the identified entry point includes any variable in its interface that is declared with the {@code ClipDistance} {@code BuiltIn} decoration,
 * that variable <b>must not</b> have an array size greater than {@link VkPhysicalDeviceLimits}{@code ::maxClipDistances}</li>
 * <li>If the identified entry point includes any variable in its interface that is declared with the {@code CullDistance} {@code BuiltIn} decoration,
 * that variable <b>must not</b> have an array size greater than {@link VkPhysicalDeviceLimits}{@code ::maxCullDistances}</li>
 * <li>If the identified entry point includes any variables in its interface that are declared with the {@code ClipDistance} or {@code CullDistance}
 * {@code BuiltIn} decoration, those variables <b>must not</b> have array sizes which sum to more than
 * {@link VkPhysicalDeviceLimits}{@code ::maxCombinedClipAndCullDistances}</li>
 * <li>If the identified entry point includes any variable in its interface that is declared with the {@code SampleMask} {@code BuiltIn} decoration, that
 * variable <b>must not</b> have an array size greater than {@link VkPhysicalDeviceLimits}{@code ::maxSampleMaskWords}</li>
 * <li>If {@code stage} is {@link VK10#VK_SHADER_STAGE_VERTEX_BIT SHADER_STAGE_VERTEX_BIT}, the identified entry point <b>must not</b> include any input variable in its interface that is decorated
 * with {@code CullDistance}</li>
 * <li>If {@code stage} is {@link VK10#VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT SHADER_STAGE_TESSELLATION_CONTROL_BIT} or {@link VK10#VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT SHADER_STAGE_TESSELLATION_EVALUATION_BIT}, and the identified entry point has an
 * {@code OpExecutionMode} instruction that specifies a patch size with {@code OutputVertices}, the patch size <b>must</b> be greater than 0 and less than
 * or equal to {@link VkPhysicalDeviceLimits}{@code ::maxTessellationPatchSize}</li>
 * <li>If {@code stage} is {@link VK10#VK_SHADER_STAGE_GEOMETRY_BIT SHADER_STAGE_GEOMETRY_BIT}, the identified entry point <b>must</b> have an {@code OpExecutionMode} instruction that specifies a
 * maximum output vertex count that is greater than 0 and less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxGeometryOutputVertices}</li>
 * <li>If {@code stage} is {@link VK10#VK_SHADER_STAGE_GEOMETRY_BIT SHADER_STAGE_GEOMETRY_BIT}, the identified entry point <b>must</b> have an {@code OpExecutionMode} instruction that specifies an
 * invocation count that is greater than 0 and less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxGeometryShaderInvocations}</li>
 * <li>If {@code stage} is {@link VK10#VK_SHADER_STAGE_GEOMETRY_BIT SHADER_STAGE_GEOMETRY_BIT}, and the identified entry point writes to {@code Layer} for any primitive, it <b>must</b> write the same
 * value to {@code Layer} for all vertices of a given primitive</li>
 * <li>If {@code stage} is {@link VK10#VK_SHADER_STAGE_GEOMETRY_BIT SHADER_STAGE_GEOMETRY_BIT}, and the identified entry point writes to {@code ViewportIndex} for any primitive, it <b>must</b> write
 * the same value to {@code ViewportIndex} for all vertices of a given primitive</li>
 * <li>If {@code stage} is {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT}, the identified entry point <b>must not</b> include any output variables in its interface decorated with
 * {@code CullDistance}</li>
 * <li>If {@code stage} is {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT}, and the identified entry point writes to {@code FragDepth} in any execution path, it <b>must</b> write to
 * {@code FragDepth} in all execution paths</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure. Must be: {@link VK10#VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO}</li>
 * <li>{@code pNext} &ndash; reserved for use by extensions</li>
 * <li>{@code flags} &ndash; reserved for future use</li>
 * <li>{@code stage} &ndash; a {@code VkShaderStageFlagBits} naming the pipeline stage. One or more of:<br><table><tr><td>{@link VK10#VK_SHADER_STAGE_ALL SHADER_STAGE_ALL}</td><td>{@link VK10#VK_SHADER_STAGE_ALL_GRAPHICS SHADER_STAGE_ALL_GRAPHICS}</td></tr><tr><td>{@link VK10#VK_SHADER_STAGE_COMPUTE_BIT SHADER_STAGE_COMPUTE_BIT}</td><td>{@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT}</td></tr><tr><td>{@link VK10#VK_SHADER_STAGE_GEOMETRY_BIT SHADER_STAGE_GEOMETRY_BIT}</td><td>{@link VK10#VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT SHADER_STAGE_TESSELLATION_CONTROL_BIT}</td></tr><tr><td>{@link VK10#VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT SHADER_STAGE_TESSELLATION_EVALUATION_BIT}</td><td>{@link VK10#VK_SHADER_STAGE_VERTEX_BIT SHADER_STAGE_VERTEX_BIT}</td></tr></table></li>
 * <li>{@code module} &ndash; a {@code VkShaderModule} object that contains the shader for this stage</li>
 * <li>{@code pName} &ndash; a pointer to a null-terminated UTF-8 string specifying the entry point name of the shader for this stage</li>
 * <li>{@code pSpecializationInfo} &ndash; a pointer to {@link VkSpecializationInfo}, can be {@code NULL}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkPipelineShaderStageCreateInfo {
    VkStructureType sType;
    const void * pNext;
    VkPipelineShaderStageCreateFlags flags;
    VkShaderStageFlagBits stage;
    VkShaderModule module;
    const char * pName;
    const VkSpecializationInfo * pSpecializationInfo;
}</code></pre>
 */
public class VkPipelineShaderStageCreateInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		FLAGS,
		STAGE,
		MODULE,
		PNAME,
		PSPECIALIZATIONINFO;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(4),
			__member(8),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		FLAGS = layout.offsetof(2);
		STAGE = layout.offsetof(3);
		MODULE = layout.offsetof(4);
		PNAME = layout.offsetof(5);
		PSPECIALIZATIONINFO = layout.offsetof(6);
	}

	VkPipelineShaderStageCreateInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkPipelineShaderStageCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkPipelineShaderStageCreateInfo(ByteBuffer container) {
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
	/** Returns the value of the {@code stage} field. */
	public int stage() { return nstage(address()); }
	/** Returns the value of the {@code module} field. */
	public long module() { return nmodule(address()); }
	/** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pName} field. */
	public ByteBuffer pName() { return npName(address()); }
	/** Decodes the null-terminated string pointed to by the {@code pName} field. */
	public String pNameString() { return npNameString(address()); }
	/** Returns a {@link VkSpecializationInfo} view of the struct pointed to by the {@code pSpecializationInfo} field. */
	public VkSpecializationInfo pSpecializationInfo() { return npSpecializationInfo(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkPipelineShaderStageCreateInfo sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkPipelineShaderStageCreateInfo pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkPipelineShaderStageCreateInfo flags(int value) { nflags(address(), value); return this; }
	/** Sets the specified value to the {@code stage} field. */
	public VkPipelineShaderStageCreateInfo stage(int value) { nstage(address(), value); return this; }
	/** Sets the specified value to the {@code module} field. */
	public VkPipelineShaderStageCreateInfo module(long value) { nmodule(address(), value); return this; }
	/** Sets the address of the specified encoded string to the {@code pName} field. */
	public VkPipelineShaderStageCreateInfo pName(ByteBuffer value) { npName(address(), value); return this; }
	/** Sets the address of the specified {@link VkSpecializationInfo} to the {@code pSpecializationInfo} field. */
	public VkPipelineShaderStageCreateInfo pSpecializationInfo(VkSpecializationInfo value) { npSpecializationInfo(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkPipelineShaderStageCreateInfo set(
		int sType,
		long pNext,
		int flags,
		int stage,
		long module,
		ByteBuffer pName,
		VkSpecializationInfo pSpecializationInfo
	) {
		sType(sType);
		pNext(pNext);
		flags(flags);
		stage(stage);
		module(module);
		pName(pName);
		pSpecializationInfo(pSpecializationInfo);

		return this;
	}

	/** Unsafe version of {@link #set(VkPipelineShaderStageCreateInfo) set}. */
	public VkPipelineShaderStageCreateInfo nset(long struct) {
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
	public VkPipelineShaderStageCreateInfo set(VkPipelineShaderStageCreateInfo src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkPipelineShaderStageCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkPipelineShaderStageCreateInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkPipelineShaderStageCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkPipelineShaderStageCreateInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkPipelineShaderStageCreateInfo} instance allocated with {@link BufferUtils}. */
	public static VkPipelineShaderStageCreateInfo create() {
		return new VkPipelineShaderStageCreateInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkPipelineShaderStageCreateInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkPipelineShaderStageCreateInfo create(long address) {
		return address == NULL ? null : new VkPipelineShaderStageCreateInfo(address, null);
	}

	/**
	 * Returns a new {@link VkPipelineShaderStageCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPipelineShaderStageCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPipelineShaderStageCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkPipelineShaderStageCreateInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkPipelineShaderStageCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkPipelineShaderStageCreateInfo mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkPipelineShaderStageCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkPipelineShaderStageCreateInfo callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkPipelineShaderStageCreateInfo} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkPipelineShaderStageCreateInfo mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkPipelineShaderStageCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkPipelineShaderStageCreateInfo callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkPipelineShaderStageCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkPipelineShaderStageCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkPipelineShaderStageCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPipelineShaderStageCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkPipelineShaderStageCreateInfo.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkPipelineShaderStageCreateInfo.PNEXT); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkPipelineShaderStageCreateInfo.FLAGS); }
	/** Unsafe version of {@link #stage}. */
	public static int nstage(long struct) { return memGetInt(struct + VkPipelineShaderStageCreateInfo.STAGE); }
	/** Unsafe version of {@link #module}. */
	public static long nmodule(long struct) { return memGetLong(struct + VkPipelineShaderStageCreateInfo.MODULE); }
	/** Unsafe version of {@link #pName}. */
	public static ByteBuffer npName(long struct) { return memByteBufferNT1(memGetAddress(struct + VkPipelineShaderStageCreateInfo.PNAME)); }
	/** Unsafe version of {@link #pNameString}. */
	public static String npNameString(long struct) { return memUTF8(memGetAddress(struct + VkPipelineShaderStageCreateInfo.PNAME)); }
	/** Unsafe version of {@link #pSpecializationInfo}. */
	public static VkSpecializationInfo npSpecializationInfo(long struct) { return VkSpecializationInfo.create(memGetAddress(struct + VkPipelineShaderStageCreateInfo.PSPECIALIZATIONINFO)); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineShaderStageCreateInfo.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineShaderStageCreateInfo.PNEXT, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkPipelineShaderStageCreateInfo.FLAGS, value); }
	/** Unsafe version of {@link #stage(int) stage}. */
	public static void nstage(long struct, int value) { memPutInt(struct + VkPipelineShaderStageCreateInfo.STAGE, value); }
	/** Unsafe version of {@link #module(long) module}. */
	public static void nmodule(long struct, long value) { memPutLong(struct + VkPipelineShaderStageCreateInfo.MODULE, value); }
	/** Unsafe version of {@link #pName(ByteBuffer) pName}. */
	public static void npName(long struct, ByteBuffer value) { 
		if ( CHECKS && value != null ) checkNT1(value); 
		memPutAddress(struct + VkPipelineShaderStageCreateInfo.PNAME, memAddress(value));
	}
	/** Unsafe version of {@link #pSpecializationInfo(VkSpecializationInfo) pSpecializationInfo}. */
	public static void npSpecializationInfo(long struct, VkSpecializationInfo value) { memPutAddress(struct + VkPipelineShaderStageCreateInfo.PSPECIALIZATIONINFO, addressSafe(value)); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		checkPointer(memGetAddress(struct + VkPipelineShaderStageCreateInfo.PNAME));
		long pSpecializationInfo = memGetAddress(struct + VkPipelineShaderStageCreateInfo.PSPECIALIZATIONINFO);
		if ( pSpecializationInfo != NULL )
			VkSpecializationInfo.validate(pSpecializationInfo);
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

	/** An array of {@link VkPipelineShaderStageCreateInfo} structs. */
	public static final class Buffer extends StructBuffer<VkPipelineShaderStageCreateInfo, Buffer> {

		/**
		 * Creates a new {@link VkPipelineShaderStageCreateInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkPipelineShaderStageCreateInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkPipelineShaderStageCreateInfo newInstance(long address) {
			return new VkPipelineShaderStageCreateInfo(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkPipelineShaderStageCreateInfo.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkPipelineShaderStageCreateInfo.npNext(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkPipelineShaderStageCreateInfo.nflags(address()); }
		/** Returns the value of the {@code stage} field. */
		public int stage() { return VkPipelineShaderStageCreateInfo.nstage(address()); }
		/** Returns the value of the {@code module} field. */
		public long module() { return VkPipelineShaderStageCreateInfo.nmodule(address()); }
		/** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pName} field. */
		public ByteBuffer pName() { return VkPipelineShaderStageCreateInfo.npName(address()); }
		/** Decodes the null-terminated string pointed to by the {@code pName} field. */
		public String pNameString() { return VkPipelineShaderStageCreateInfo.npNameString(address()); }
		/** Returns a {@link VkSpecializationInfo} view of the struct pointed to by the {@code pSpecializationInfo} field. */
		public VkSpecializationInfo pSpecializationInfo() { return VkPipelineShaderStageCreateInfo.npSpecializationInfo(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkPipelineShaderStageCreateInfo.Buffer sType(int value) { VkPipelineShaderStageCreateInfo.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkPipelineShaderStageCreateInfo.Buffer pNext(long value) { VkPipelineShaderStageCreateInfo.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkPipelineShaderStageCreateInfo.Buffer flags(int value) { VkPipelineShaderStageCreateInfo.nflags(address(), value); return this; }
		/** Sets the specified value to the {@code stage} field. */
		public VkPipelineShaderStageCreateInfo.Buffer stage(int value) { VkPipelineShaderStageCreateInfo.nstage(address(), value); return this; }
		/** Sets the specified value to the {@code module} field. */
		public VkPipelineShaderStageCreateInfo.Buffer module(long value) { VkPipelineShaderStageCreateInfo.nmodule(address(), value); return this; }
		/** Sets the address of the specified encoded string to the {@code pName} field. */
		public VkPipelineShaderStageCreateInfo.Buffer pName(ByteBuffer value) { VkPipelineShaderStageCreateInfo.npName(address(), value); return this; }
		/** Sets the address of the specified {@link VkSpecializationInfo} to the {@code pSpecializationInfo} field. */
		public VkPipelineShaderStageCreateInfo.Buffer pSpecializationInfo(VkSpecializationInfo value) { VkPipelineShaderStageCreateInfo.npSpecializationInfo(address(), value); return this; }

	}

}