/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;
import java.util.Set;

/** Defines the capabilities of an OpenGL context. */
public final class ContextCapabilities {

	final GL11                    __GL11;
	final GL12                    __GL12;
	final GL13                    __GL13;
	final GL14                    __GL14;
	final GL15                    __GL15;
	final GL20                    __GL20;
	final GL21                    __GL21;
	final GL30                    __GL30;
	final GL31                    __GL31;
	final GL32                    __GL32;
	final GL33                    __GL33;
	final GL40                    __GL40;
	final GL41                    __GL41;
	final GL42                    __GL42;
	final GL43                    __GL43;
	final GL44                    __GL44;
	final GL45                    __GL45;
	final GLX11                   __GLX11;
	final GLX12                   __GLX12;
	final GLX13                   __GLX13;
	final GLX14                   __GLX14;
	final GLXAMDGPUAssociation    __GLXAMDGPUAssociation;
	final GLXARBCreateContext     __GLXARBCreateContext;
	final GLXARBGetProcAddress    __GLXARBGetProcAddress;
	final GLXEXTImportContext     __GLXEXTImportContext;
	final GLXEXTSwapControl       __GLXEXTSwapControl;
	final GLXEXTTextureFromPixmap __GLXEXTTextureFromPixmap;
	final GLXNVCopyImage          __GLXNVCopyImage;
	final GLXNVDelayBeforeSwap    __GLXNVDelayBeforeSwap;
	final GLXSGIMakeCurrentRead   __GLXSGIMakeCurrentRead;
	final GLXSGISwapControl       __GLXSGISwapControl;
	final GLXSGIVideoSync         __GLXSGIVideoSync;
	final GLXSGIXFBConfig         __GLXSGIXFBConfig;
	final GLXSGIXPBuffer          __GLXSGIXPBuffer;
	final GLXSGIXSwapBarrier      __GLXSGIXSwapBarrier;
	final GLXSGIXSwapGroup        __GLXSGIXSwapGroup;
	final AMDDebugOutput          __AMDDebugOutput;
	final AMDOcclusionQueryEvent  __AMDOcclusionQueryEvent;
	final ARBBufferStorage        __ARBBufferStorage;
	final ARBCLEvent              __ARBCLEvent;
	final ARBClearTexture         __ARBClearTexture;
	final ARBClipControl          __ARBClipControl;
	final ARBColorBufferFloat     __ARBColorBufferFloat;
	final ARBCopyBuffer           __ARBCopyBuffer;
	final ARBDirectStateAccess    __ARBDirectStateAccess;
	final ARBDrawBuffers          __ARBDrawBuffers;
	final ARBDrawBuffersBlend     __ARBDrawBuffersBlend;
	final ARBES31Compatibility    __ARBES31Compatibility;
	final ARBGetTextureSubImage   __ARBGetTextureSubImage;
	final ARBImaging              __ARBImaging;
	final ARBMatrixPalette        __ARBMatrixPalette;
	final ARBMultiBind            __ARBMultiBind;
	final ARBMultisample          __ARBMultisample;
	final ARBOcclusionQuery       __ARBOcclusionQuery;
	final ARBPointParameters      __ARBPointParameters;
	final ARBShaderObjects        __ARBShaderObjects;
	final ARBSparseBuffer         __ARBSparseBuffer;
	final ARBSync                 __ARBSync;
	final ARBTextureBarrier       __ARBTextureBarrier;
	final ARBTextureCompression   __ARBTextureCompression;
	final ARBTransposeMatrix      __ARBTransposeMatrix;
	final ARBVertexBlend          __ARBVertexBlend;
	final ARBVertexBufferObject   __ARBVertexBufferObject;
	final ARBVertexProgram        __ARBVertexProgram;
	final ARBVertexShader         __ARBVertexShader;
	final ARBWindowPos            __ARBWindowPos;
	final KHRRobustness           __KHRRobustness;
	final WGLAMDGPUAssociation    __WGLAMDGPUAssociation;
	final WGLARBBufferRegion      __WGLARBBufferRegion;
	final WGLARBCreateContext     __WGLARBCreateContext;
	final WGLARBExtensionsString  __WGLARBExtensionsString;
	final WGLARBMakeCurrentRead   __WGLARBMakeCurrentRead;
	final WGLARBPbuffer           __WGLARBPbuffer;
	final WGLARBPixelFormat       __WGLARBPixelFormat;
	final WGLARBRenderTexture     __WGLARBRenderTexture;
	final WGLEXTExtensionsString  __WGLEXTExtensionsString;
	final WGLEXTSwapControl       __WGLEXTSwapControl;
	final WGLNVCopyImage          __WGLNVCopyImage;
	final WGLNVDelayBeforeSwap    __WGLNVDelayBeforeSwap;
	final WGLNVDXInterop          __WGLNVDXInterop;
	final WGLNVGPUAffinity        __WGLNVGPUAffinity;

	/** When true, {@link GL11} is supported. */
	public final boolean OpenGL11;
	/** When true, {@link GL12} is supported. */
	public final boolean OpenGL12;
	/** When true, {@link GL13} is supported. */
	public final boolean OpenGL13;
	/** When true, {@link GL14} is supported. */
	public final boolean OpenGL14;
	/** When true, {@link GL15} is supported. */
	public final boolean OpenGL15;
	/** When true, {@link GL20} is supported. */
	public final boolean OpenGL20;
	/** When true, {@link GL21} is supported. */
	public final boolean OpenGL21;
	/** When true, {@link GL30} is supported. */
	public final boolean OpenGL30;
	/** When true, {@link GL31} is supported. */
	public final boolean OpenGL31;
	/** When true, {@link GL32} is supported. */
	public final boolean OpenGL32;
	/** When true, {@link GL33} is supported. */
	public final boolean OpenGL33;
	/** When true, {@link GL40} is supported. */
	public final boolean OpenGL40;
	/** When true, {@link GL41} is supported. */
	public final boolean OpenGL41;
	/** When true, {@link GL42} is supported. */
	public final boolean OpenGL42;
	/** When true, {@link GL43} is supported. */
	public final boolean OpenGL43;
	/** When true, {@link GL44} is supported. */
	public final boolean OpenGL44;
	/** When true, {@link GL45} is supported. */
	public final boolean OpenGL45;
	/** When true, {@link GLX11} is supported. */
	public final boolean GLX_11;
	/** When true, {@link GLX12} is supported. */
	public final boolean GLX_12;
	/** When true, {@link GLX13} is supported. */
	public final boolean GLX_13;
	/** When true, {@link GLX14} is supported. */
	public final boolean GLX_14;
	/** When true, {@link GLXAMDGPUAssociation} is supported. */
	public final boolean GLX_AMD_gpu_association;
	/** When true, {@link GLXARBContextFlushControl} is supported. */
	public final boolean GLX_ARB_context_flush_control;
	/** When true, {@link GLXARBCreateContext} is supported. */
	public final boolean GLX_ARB_create_context;
	/** When true, {@link GLXARBCreateContextProfile} is supported. */
	public final boolean GLX_ARB_create_context_profile;
	/** When true, {@link GLXARBCreateContextRobustness} is supported. */
	public final boolean GLX_ARB_create_context_robustness;
	/** When true, {@link GLXARBFBConfigFloat} is supported. */
	public final boolean GLX_ARB_fbconfig_float;
	/** When true, {@link GLXARBFramebufferSRGB} is supported. */
	public final boolean GLX_ARB_framebuffer_sRGB;
	/** When true, {@link GLXARBGetProcAddress} is supported. */
	public final boolean GLX_ARB_get_proc_address;
	/** When true, {@link GLXARBMultisample} is supported. */
	public final boolean GLX_ARB_multisample;
	/** When true, {@link GLXARBRobustnessApplicationIsolation} is supported. */
	public final boolean GLX_ARB_robustness_application_isolation;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/glx_robustness_isolation.txt">GLX_ARB_robustness_share_group_isolation</a> extension is supported.
	 * <p/>
	 * If the graphics driver advertises the GLX_ARB_robustness_share_group_isolation extension string, then the driver guarantees that if a context in a
	 * particular share group causes a graphics reset to occur:
	 * <ol>
	 * <li>No other share group within the application, nor any other application on the system, is affected by the graphics reset.</li>
	 * <li>No other share group within the application, nor any other application on the system, receives any notification that the graphics reset occurred.</li>
	 * </ol>
	 * Requires {@link GLX14 GLX 1.4} and {@link GLXARBCreateContextRobustness GLX_ARB_create_context_robustness}.
	 */
	public final boolean GLX_ARB_robustness_share_group_isolation;
	/** When true, {@link GLXARBVertexBufferObject} is supported. */
	public final boolean GLX_ARB_vertex_buffer_object;
	/** When true, {@link GLXEXTBufferAge} is supported. */
	public final boolean GLX_EXT_buffer_age;
	/** When true, {@link GLXEXTCreateContextESProfile} is supported. */
	public final boolean GLX_EXT_create_context_es_profile;
	/** When true, {@link GLXEXTFBConfigPackedFloat} is supported. */
	public final boolean GLX_EXT_fbconfig_packed_float;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/EXT/framebuffer_sRGB.txt">GLX_EXT_framebuffer_sRGB</a> extension is supported.
	 * <p/>
	 * This extension adds a framebuffer capability for sRGB framebuffer update and blending.
	 */
	public final boolean GLX_EXT_framebuffer_sRGB;
	/** When true, {@link GLXEXTImportContext} is supported. */
	public final boolean GLX_EXT_import_context;
	/** When true, {@link GLXEXTSwapControl} is supported. */
	public final boolean GLX_EXT_swap_control;
	/** When true, {@link GLXEXTSwapControlTear} is supported. */
	public final boolean GLX_EXT_swap_control_tear;
	/** When true, {@link GLXEXTTextureFromPixmap} is supported. */
	public final boolean GLX_EXT_texture_from_pixmap;
	/** When true, {@link GLXEXTVisualInfo} is supported. */
	public final boolean GLX_EXT_visual_info;
	/** When true, {@link GLXEXTVisualRating} is supported. */
	public final boolean GLX_EXT_visual_rating;
	/** When true, {@link GLXINTELSwapEvent} is supported. */
	public final boolean GLX_INTEL_swap_event;
	/** When true, {@link GLXNVCopyImage} is supported. */
	public final boolean GLX_NV_copy_image;
	/** When true, {@link GLXNVDelayBeforeSwap} is supported. */
	public final boolean GLX_NV_delay_before_swap;
	/** When true, {@link GLXSGIMakeCurrentRead} is supported. */
	public final boolean GLX_SGI_make_current_read;
	/** When true, {@link GLXSGISwapControl} is supported. */
	public final boolean GLX_SGI_swap_control;
	/** When true, {@link GLXSGIVideoSync} is supported. */
	public final boolean GLX_SGI_video_sync;
	/** When true, {@link GLXSGIXFBConfig} is supported. */
	public final boolean GLX_SGIX_fbconfig;
	/** When true, {@link GLXSGIXPBuffer} is supported. */
	public final boolean GLX_SGIX_pbuffer;
	/** When true, {@link GLXSGIXSwapBarrier} is supported. */
	public final boolean GLX_SGIX_swap_barrier;
	/** When true, {@link GLXSGIXSwapGroup} is supported. */
	public final boolean GLX_SGIX_swap_group;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/AMD/conservative_depth.txt">AMD_conservative_depth</a> extension is supported.
	 * <p/>
	 * There is a common optimization for hardware accelerated implementation of OpenGL which relies on an early depth test to be run before the fragment
	 * shader so that the shader evaluation can be skipped if the fragment ends up being discarded because it is occluded.
	 * <p/>
	 * This optimization does not affect the final rendering, and is typically possible when the fragment does not change the depth programmatically. (i.e.: it
	 * does not write to the built-in {@code gl_FragDepth} output). There are, however a class of operations on the depth in the shader which could still be
	 * performed while allowing the early depth test to operate.
	 * <p/>
	 * This extension allows the application to pass enough information to the GL implementation to activate such optimizations safely.
	 * <p/>
	 * Requires {@link GL30 OpenGL 3.0}. Promoted to core in {@link GL42 OpenGL 4.2}.
	 */
	public final boolean GL_AMD_conservative_depth;
	/** When true, {@link AMDDebugOutput} is supported. */
	public final boolean GL_AMD_debug_output;
	/** When true, {@link AMDOcclusionQueryEvent} is supported. */
	public final boolean GL_AMD_occlusion_query_event;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/AMD/shader_stencil_export.txt">AMD_shader_stencil_export</a> extension is supported.
	 * <p/>
	 * In OpenGL, the stencil test is a powerful mechanism to selectively discard fragments based on the content of the stencil buffer. However, facilites to
	 * update the content of the stencil buffer are limited to operations such as incrementing the existing value, or overwriting with a fixed reference value.
	 * <p/>
	 * This extension provides a mechanism whereby a shader may generate the stencil reference value per invocation. When stencil testing is enabled, this
	 * allows the test to be performed against the value generated in the shader. When the stencil operation is set to {@link GL11#GL_REPLACE REPLACE}, this
	 * allows a value generated in the shader to be written to the stencil buffer directly.
	 * <p/>
	 * Requires {@link #GL_ARB_fragment_shader ARB_fragment_shader}.
	 */
	public final boolean GL_AMD_shader_stencil_export;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/AMD/shader_trinary_minmax.txt">AMD_shader_trinary_minmax</a> extension is supported.
	 * <p/>
	 * This extension introduces three new trinary built-in functions to the OpenGL Shading Languages. These functions allow the minimum, maximum or median of
	 * three inputs to be found with a single function call. These operations may be useful for sorting and filtering operations, for example. By explicitly
	 * performing a trinary operation with a single built-in function, shader compilers and optimizers may be able to generate better instruction sequences for
	 * perform sorting and other multi-input functions.
	 * <p/>
	 * Requires {@link GL20 OpenGL 2.0} or {@link #GL_ARB_shader_object ARB_shader_object}.
	 */
	public final boolean GL_AMD_shader_trinary_minmax;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/AMD/texture_texture4.txt">AMD_texture_texture4</a> extension is supported.
	 * <p/>
	 * This extension adds new shading language built-in texture functions to the shading language.
	 * <p/>
	 * These texture functions may be used to access one component textures.
	 * <p/>
	 * The {@code texture4} built-in function returns a texture value derived from a 2x2 set of texels in the image array of level levelbase is selected. These
	 * texels are selected in the same way as when the value of {@link GL11#GL_TEXTURE_MIN_FILTER TEXTURE_MIN_FILTER} is {@GL11#GL_LINEAR LINEAR}, but instead
	 * of these texels being filtered to generate the texture value, the R, G, B and A texture values are derived directly from these four texels.
	 */
	public final boolean GL_AMD_texture_texture4;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/AMD/transform_feedback3_lines_triangles.txt">AMD_transform_feedback3_lines_triangles</a> extension is supported.
	 * <p/>
	 * OpenGL 4.0 introduced the ability to record primitives into multiple output streams using transform feedback. However, the restriction that all streams
	 * must output {@link GL11#GL_POINT POINT} primitives when more than one output stream is active was also introduced. This extension simply removes that
	 * restriction, allowing the same set of primitives to be used with multiple transform feedback streams as with a single stream.
	 * <p/>
	 * Requires {@link GL40 OpenGL 4.0} or {@link #GL_ARB_transform_feedback3 ARB_transform_feedback3}.
	 */
	public final boolean GL_AMD_transform_feedback3_lines_triangles;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/AMD/vertex_shader_layer.txt">AMD_vertex_shader_layer</a> extension is supported.
	 * <p/>
	 * The {@code gl_Layer} built-in shading language variable was introduced with the {@link #GL_ARB_geometry_shader ARB_geometry_shader} extension and subsequently promoted to core
	 * OpenGL in version 3.2. This variable is an output from the geometry shader stage that allows rendering to be directed to a specific layer of an array
	 * texture, slice of a 3D texture or face of a cube map or cube map array attachment of the framebuffer. Thus, this extremely useful functionality is only
	 * available if a geometry shader is present - even if the geometry shader is not otherwise required by the application. This adds overhead to the graphics
	 * processing pipeline, and complexity to applications. It also precludes implementations that cannot support geometry shaders from supporting rendering to
	 * layered framebuffer attachments.
	 * <p/>
	 * This extension exposes the {@code gl_Layer} built-in variable in the vertex shader, allowing rendering to be directed to layered framebuffer attachments
	 * with only a vertex and fragment shader present. Combined with features such as instancing, or static vertex attributes and so on, this allows a wide
	 * variety of techniques to be implemented without the requirement for a geometry shader to be present.
	 * <p/>
	 * Requires {@link GL30 OpenGL 3.0} or {@link #GL_EXT_texture_array EXT_texture_array}.
	 */
	public final boolean GL_AMD_vertex_shader_layer;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/AMD/vertex_shader_viewport_index.txt">AMD_vertex_shader_viewport_index</a> extension is supported.
	 * <p/>
	 * The {@code gl_ViewportIndex} built-in variable was introduced by the {@link #GL_ARB_viewport_array ARB_viewport_array} extension and {@link GL41 OpenGL 4.1}. This variable is available
	 * in un-extended OpenGL only to the geometry shader. When written in the geometry shader, it causes geometry to be directed to one of an array of several
	 * independent viewport rectangles.
	 * <p/>
	 * In order to use any viewport other than zero, a geometry shader must be present. Geometry shaders introduce processing overhead and potential
	 * performance issues. This extension exposes the {@code gl_ViewportIndex} built-in variable to the vertex shader, allowing the functionality introduced by
	 * ARB_viewport_array to be accessed without requiring a geometry shader to be present.
	 * <p/>
	 * Requires {@link GL41 OpenGL 4.1} or {@link #GL_ARB_viewport_array ARB_viewport_array}.
	 */
	public final boolean GL_AMD_vertex_shader_viewport_index;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/arrays_of_arrays.txt">ARB_arrays_of_arrays</a> extension is supported.
	 * <p/>
	 * This extension removes the restriction that arrays cannot be formed into arrays, allowing arrays of arrays to be declared.
	 * <p/>
	 * Requires GLSL 1.2. Promoted to core in {@link GL43 OpenGL 4.3}.
	 */
	public final boolean GL_ARB_arrays_of_arrays;
	/** When true, {@link ARBBufferStorage} is supported. */
	public final boolean GL_ARB_buffer_storage;
	/** When true, {@link ARBCLEvent} is supported. */
	public final boolean GL_ARB_cl_event;
	/** When true, {@link ARBClearTexture} is supported. */
	public final boolean GL_ARB_clear_texture;
	/** When true, {@link ARBClipControl} is supported. */
	public final boolean GL_ARB_clip_control;
	/** When true, {@link ARBColorBufferFloat} is supported. */
	public final boolean GL_ARB_color_buffer_float;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/compatibility.txt">ARB_compatibility</a> extension is supported.
	 * <p/>
	 * This extension restores features deprecated by {@link GL30 OpenGL 3.0}.
	 */
	public final boolean GL_ARB_compatibility;
	/** When true, {@link ARBConditionalRenderInverted} is supported. */
	public final boolean GL_ARB_conditional_render_inverted;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/conservative_depth.txt">ARB_conservative_depth</a> extension is supported.
	 * <p/>
	 * There is a common optimization for hardware accelerated implementation of OpenGL which relies on an early depth test to be run before the fragment
	 * shader so that the shader evaluation can be skipped if the fragment ends up being discarded because it is occluded.
	 * <p/>
	 * This optimization does not affect the final rendering, and is typically possible when the fragment does not change the depth programmatically. (i.e.: it
	 * does not write to the built-in gl_FragDepth output). There are, however a class of operations on the depth in the shader which could still be performed
	 * while allowing the early depth test to operate.
	 * <p/>
	 * This extension allows the application to pass enough information to the GL implementation to activate such optimizations safely.
	 * <p/>
	 * Requires {@link GL30 OpenGL 3.0}. Promoted to core in {@link GL42 OpenGL 4.2}.
	 */
	public final boolean GL_ARB_conservative_depth;
	/** When true, {@link ARBCopyBuffer} is supported. */
	public final boolean GL_ARB_copy_buffer;
	/** When true, {@link ARBCullDistance} is supported. */
	public final boolean GL_ARB_cull_distance;
	/** When true, {@link ARBDepthBufferFloat} is supported. */
	public final boolean GL_ARB_depth_buffer_float;
	/** When true, {@link ARBDepthTexture} is supported. */
	public final boolean GL_ARB_depth_texture;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/derivative_control.txt">ARB_derivative_control</a> extension is supported.
	 * <p/>
	 * This extension provides control over the spacial granularity at which the underlying implementation computes derivatives.
	 * <p/>
	 * Requires {@link GL40 OpenGL 4.0} and GLSL 4.00. Promoted to core in {@link GL45 OpenGL 4.5}.
	 */
	public final boolean GL_ARB_derivative_control;
	/** When true, {@link ARBDirectStateAccess} is supported. */
	public final boolean GL_ARB_direct_state_access;
	/** When true, {@link ARBDrawBuffers} is supported. */
	public final boolean GL_ARB_draw_buffers;
	/** When true, {@link ARBDrawBuffersBlend} is supported. */
	public final boolean GL_ARB_draw_buffers_blend;
	/** When true, {@link ARBEnhancedLayouts} is supported. */
	public final boolean GL_ARB_enhanced_layouts;
	/** When true, {@link ARBES31Compatibility} is supported. */
	public final boolean GL_ARB_ES3_1_compatibility;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/explicit_attrib_location.txt">ARB_explicit_attrib_location</a> extension is supported.
	 * <p/>
	 * This extension provides a method to pre-assign attribute locations to named vertex shader inputs and color numbers to named fragment shader outputs.
	 * This allows applications to globally assign a particular semantic meaning, such as diffuse color or vertex normal, to a particular attribute location
	 * without knowing how that attribute will be named in any particular shader.
	 * <p/>
	 * Requires {@link GL20 OpenGL 2.0} or {@link #GL_ARB_vertex_shader ARB_vertex_shader}. Promoted to core in {@link GL33 OpenGL 3.3}.
	 */
	public final boolean GL_ARB_explicit_attrib_location;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/fragment_coord_conventions.txt">ARB_fragment_coord_conventions</a> extension is supported.
	 * <p/>
	 * This extension provides alternative conventions for the fragment coordinate XY location available for programmable fragment processing.
	 * <p/>
	 * Promoted to core in {@link GL32 OpenGL 3.2}.
	 */
	public final boolean GL_ARB_fragment_coord_conventions;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/fragment_layer_viewport.txt">ARB_fragment_layer_viewport</a> extension is supported.
	 * <p/>
	 * The geometry shader has the special built-in variables gl_Layer and gl_ViewportIndex that specify which layer and viewport primitives are rendered to.
	 * Currently the fragment shader does not know which layer or viewport the fragments are being written to without the application implementing their own
	 * interface variables between the geometry and fragment shaders.
	 * <p/>
	 * This extension specifies that the gl_Layer and gl_ViewportIndex built-in variables are also available to the fragment shader so the application doesn't
	 * need to implement these manually.
	 * <p/>
	 * Requires {@link GL30 OpenGL 3.0} and {@link #GL_ARB_geometry_shader4 ARB_geometry_shader4}, or {@link GL32 OpenGL 3.2}. Promoted to core in {@link GL43 OpenGL 4.3}.
	 */
	public final boolean GL_ARB_fragment_layer_viewport;
	/** When true, {@link ARBFragmentProgram} is supported. */
	public final boolean GL_ARB_fragment_program;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/fragment_program_shadow.txt">ARB_fragment_program_shadow</a> extension is supported.
	 * <p/>
	 * This extension extends ARB_fragment_program to remove the interaction with ARB_shadow and defines the program option "ARB_fragment_program_shadow".
	 * <p/>
	 * Requires {@link #GL_ARB_fragment_program ARB_fragment_program} and {@link #GL_ARB_shadow ARB_shadow}.
	 */
	public final boolean GL_ARB_fragment_program_shadow;
	/** When true, {@link ARBFragmentShader} is supported. */
	public final boolean GL_ARB_fragment_shader;
	/** When true, {@link ARBGetTextureSubImage} is supported. */
	public final boolean GL_ARB_get_texture_sub_image;
	/** When true, {@link ARBHalfFloatPixel} is supported. */
	public final boolean GL_ARB_half_float_pixel;
	/** When true, {@link ARBImaging} is supported. */
	public final boolean GL_ARB_imaging;
	/** When true, {@link ARBMatrixPalette} is supported. */
	public final boolean GL_ARB_matrix_palette;
	/** When true, {@link ARBMultiBind} is supported. */
	public final boolean GL_ARB_multi_bind;
	/** When true, {@link ARBMultisample} is supported. */
	public final boolean GL_ARB_multisample;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/multitexture.txt">ARB_multitexture</a> extension is supported.
	 * <p/>
	 * This extension allows application of multiple textures to a fragment in one rendering pass.
	 * <p/>
	 * Promoted to core in {@link GL12 OpenGL 1.2}.
	 */
	public final boolean GL_ARB_multitexture;
	/** When true, {@link ARBOcclusionQuery} is supported. */
	public final boolean GL_ARB_occlusion_query;
	/** When true, {@link ARBPipelineStatisticsQuery} is supported. */
	public final boolean GL_ARB_pipeline_statistics_query;
	/** When true, {@link ARBPixelBufferObject} is supported. */
	public final boolean GL_ARB_pixel_buffer_object;
	/** When true, {@link ARBPointParameters} is supported. */
	public final boolean GL_ARB_point_parameters;
	/** When true, {@link ARBPointSprite} is supported. */
	public final boolean GL_ARB_point_sprite;
	/** When true, {@link ARBQueryBufferObject} is supported. */
	public final boolean GL_ARB_query_buffer_object;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/robust_buffer_access_behavior.txt">ARB_robust_buffer_access_behavior</a> extension is supported.
	 * <p/>
	 * This extension specifies the behavior of out-of-bounds buffer and array accesses. This is an improvement over the existing ARB_robustness extension
	 * which stated that the application should not crash, but the behavior is otherwise undefined. This extension specifies the access protection provided by
	 * the GL to ensure that out-of-bounds accesses cannot read from or write to data not owned by the application. All accesses are contained within the
	 * buffer object and program area they reference. These additional robustness guarantees apply to contexts created with the
	 * {@code CONTEXT_FLAG_ROBUST_ACCESS_BIT_ARB} feature enabled.
	 * <p/>
	 * Requires {@link #GL_ARB_robustness ARB_robustness}. Promoted to core in {@link GL43 OpenGL 4.3}.
	 */
	public final boolean GL_ARB_robust_buffer_access_behavior;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/robustness_isolation.txt">ARB_robustness_isolation</a> extension is supported.
	 * <p/>
	 * GL_ARB_robustness and supporting window system extensions allow creating an OpenGL context supporting graphics reset notification behavior.
	 * GL_ARB_robustness_isolation provides stronger guarantees about the possible side-effects of a graphics reset.
	 * <p/>
	 * Requires {@link #GL_ARB_robustness ARB_robustness}. Promoted to core in {@link GL43 OpenGL 4.3}.
	 */
	public final boolean GL_ARB_robustness_isolation;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/shader_bit_encoding.txt">ARB_shader_bit_encoding</a> extension is supported.
	 * <p/>
	 * This extension trivially adds built-in functions for getting/setting the bit encoding for floating-point values in the OpenGL Shading Language.
	 * <p/>
	 * Promoted to core in {@link GL33 OpenGL 3.3}.
	 */
	public final boolean GL_ARB_shader_bit_encoding;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/shader_image_size.txt">ARB_shader_image_size</a> extension is supported.
	 * <p/>
	 * This extension provides GLSL built-in functions allowing shaders to query the size of an image.
	 * <p/>
	 * Requires {@link GL42 OpenGL 4.2} and GLSL 4.20. Promoted to core in {@link GL43 OpenGL 4.3}.
	 */
	public final boolean GL_ARB_shader_image_size;
	/** When true, {@link ARBShaderObjects} is supported. */
	public final boolean GL_ARB_shader_objects;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/shader_precision.txt">ARB_shader_precision</a> extension is supported.
	 * <p/>
	 * This extension more clearly restricts the precision requirements of implementations of the GLSL specification. These include precision of arithmetic
	 * operations (operators '+', '/', ...), transcendentals (log, exp, pow, reciprocal sqrt, ...), when NaNs (not a number) and INFs (infinities) will be
	 * supported and generated, and denorm flushing behavior.  Trigonometric built-ins and some other categories of built-ins are not addressed.
	 * <p/>
	 * Requires {@link GL40 OpenGL 4.0}. Promoted to core in {@link GL41 OpenGL 4.1}.
	 */
	public final boolean GL_ARB_shader_precision;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/shader_stencil_export.txt">ARB_shader_stencil_export</a> extension is supported.
	 * <p/>
	 * In OpenGL, the stencil test is a powerful mechanism to selectively discard fragments based on the content of the stencil buffer. However, facilites to
	 * update the content of the stencil buffer are limited to operations such as incrementing the existing value, or overwriting with a fixed reference value.
	 * <p/>
	 * This extension provides a mechanism whereby a shader may generate the stencil reference value per invocation. When stencil testing is enabled, this
	 * allows the test to be performed against the value generated in the shader. When the stencil operation is set to {@link GL11#GL_REPLACE REPLACE}, this
	 * allows a value generated in the shader to be written to the stencil buffer directly.
	 * <p/>
	 * Requires {@link #GL_ARB_fragment_shader ARB_fragment_shader}.
	 */
	public final boolean GL_ARB_shader_stencil_export;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/shader_texture_image_samples.txt">ARB_shader_texture_image_samples</a> extension is supported.
	 * <p/>
	 * This extension provides GLSL built-in functions allowing shaders to query the number of samples of a texture.
	 * <p/>
	 * Requires {@link GL43 OpenGL 4.3}. Promoted to core in {@link GL45 OpenGL 4.5}.
	 */
	public final boolean GL_ARB_shader_texture_image_samples;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/shader_texture_lod.txt">ARB_shader_texture_lod</a> extension is supported.
	 * <p/>
	 * This extension adds additional texture functions to the OpenGL Shading Language which provide the shader writer with explicit control of LOD.
	 * <p/>
	 * Requires {@link #GL_ARB_shader_objects ARB_shader_objects}. Promoted to core in {@link GL30 OpenGL 3.0}.
	 */
	public final boolean GL_ARB_shader_texture_lod;
	/** When true, {@link ARBShadingLanguage100} is supported. */
	public final boolean GL_ARB_shading_language_100;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/shading_language_420pack.txt">ARB_shading_language_420pack</a> extension is supported.
	 * <p/>
	 * This is a language feature only extension formed from changes made to version 4.20 of GLSL.
	 * <p/>
	 * Requires GLSL 1.30. Requires GLSL 1.40 for uniform block bindings. Promoted to core in {@link GL42 OpenGL 4.2}.
	 */
	public final boolean GL_ARB_shading_language_420pack;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/shading_language_packing.txt">ARB_shading_language_packing</a> extension is supported.
	 * <p/>
	 * This extension provides the GLSL built-in functions to convert a 32-bit unsigned integer holding a pair of 16-bit floating-point values to or from a
	 * two-component floating-point vector (vec2).
	 * <p/>
	 * This mechanism allows GLSL shaders to read and write 16-bit floating-point encodings (via 32-bit unsigned integers) without introducing a full set of
	 * 16-bit floating-point data types.
	 * <p/>
	 * This extension also adds the GLSL built-in packing functions included in GLSL version 4.00 and the ARB_gpu_shader5 extension which pack and unpack
	 * vectors of small fixed-point data types into a larger scalar. By putting these packing functions in this separate extension it allows implementations to
	 * provide these functions in hardware that supports them independent of the other {@link #GL_ARB_gpu_shader5 ARB_gpu_shader5} features.
	 * <p/>
	 * In addition to the packing functions from ARB_gpu_shader5 this extension also adds the missing {@code [un]packSnorm2x16} for completeness.
	 * <p/>
	 * Promoted to core in {@link GL42 OpenGL 4.2}.
	 */
	public final boolean GL_ARB_shading_language_packing;
	/** When true, {@link ARBShadow} is supported. */
	public final boolean GL_ARB_shadow;
	/** When true, {@link ARBShadowAmbient} is supported. */
	public final boolean GL_ARB_shadow_ambient;
	/** When true, {@link ARBSparseBuffer} is supported. */
	public final boolean GL_ARB_sparse_buffer;
	/** When true, {@link ARBSync} is supported. */
	public final boolean GL_ARB_sync;
	/** When true, {@link ARBTextureBarrier} is supported. */
	public final boolean GL_ARB_texture_barrier;
	/** When true, {@link ARBTextureBorderClamp} is supported. */
	public final boolean GL_ARB_texture_border_clamp;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/texture_buffer_object_rgb32.txt">ARB_texture_buffer_object_rgb32</a> extension is supported.
	 * <p/>
	 * This extension adds three new buffer texture formats - RGB32F, RGB32I, and RGB32UI. This partially addresses one of the limitations of buffer textures
	 * in the original {@link #GL_EXT_texture_buffer_object EXT_texture_buffer_object} extension and in {@link GL31 OpenGL 3.1}, which provide no support for three-component formats.
	 * <p/>
	 * Promoted to core in {@link GL40 OpenGL 4.0}.
	 */
	public final boolean GL_ARB_texture_buffer_object_rgb32;
	/** When true, {@link ARBTextureCompression} is supported. */
	public final boolean GL_ARB_texture_compression;
	/** When true, {@link ARBTextureCubeMap} is supported. */
	public final boolean GL_ARB_texture_cube_map;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/texture_env_add.txt">ARB_texture_env_add</a> extension is supported.
	 * <p/>
	 * This extension adds a new texture environment function: ADD.
	 * <p/>
	 * Promoted to core in {@link GL13 OpenGL 1.3}.
	 */
	public final boolean GL_ARB_texture_env_add;
	/** When true, {@link ARBTextureEnvCombine} is supported. */
	public final boolean GL_ARB_texture_env_combine;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/texture_env_crossbar.txt">ARB_texture_env_crossbar</a> extension is supported.
	 * <p/>
	 * This extension adds the capability to use the texture color from other texture units as sources to the ARBTextureEnvCombine#COMBINE_ARB environment
	 * function. The {@link ARBTextureEnvCombine ARB_texture_env_combine} extension defined texture environment functions which could use the color from the current texture unit
	 * as a source. This extension adds the ability to use the color from any texture unit as a source.
	 * <p/>
	 * Requires {@link #GL_ARB_multitexture ARB_multitexture} and {@link ARBTextureEnvCombine ARB_texture_env_combine}. Promoted to core in {@link GL14 OpenGL 1.4}.
	 */
	public final boolean GL_ARB_texture_env_crossbar;
	/** When true, {@link ARBTextureEnvDot3} is supported. */
	public final boolean GL_ARB_texture_env_dot3;
	/** When true, {@link ARBTextureFloat} is supported. */
	public final boolean GL_ARB_texture_float;
	/** When true, {@link ARBTextureMirrorClampToEdge} is supported. */
	public final boolean GL_ARB_texture_mirror_clamp_to_edge;
	/** When true, {@link ARBTextureMirroredRepeat} is supported. */
	public final boolean GL_ARB_texture_mirrored_repeat;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/texture_non_power_of_two.txt">ARB_texture_non_power_of_two</a> extension is supported.
	 * <p/>
	 * Conventional OpenGL texturing is limited to images with power-of-two dimensions and an optional 1-texel border. This extension relaxes the size
	 * restrictions for the 1D, 2D, cube map, and 3D texture targets.
	 * <p/>
	 * Promoted to core in {@link GL20 OpenGL 2.0}.
	 */
	public final boolean GL_ARB_texture_non_power_of_two;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/texture_query_levels.txt">ARB_texture_query_levels</a> extension is supported.
	 * <p/>
	 * This extension provides a new set of texture functions ({@code textureQueryLevels}) in the OpenGL Shading Language that exposes the number of accessible
	 * mipmap levels in the texture associated with a GLSL sampler variable.
	 * <p/>
	 * Requires {@link GL30 OpenGL 3.0} and GLSL 1.30. Promoted to core in {@link GL43 OpenGL 4.3}.
	 */
	public final boolean GL_ARB_texture_query_levels;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/texture_query_lod.txt">ARB_texture_query_lod</a> extension is supported.
	 * <p/>
	 * This extension provides a new set of fragment shader texture functions ({@code textureLOD}) that return the results of automatic level-of-detail
	 * computations that would be performed if a texture lookup were performed.
	 * <p/>
	 * Requires {@link GL20 OpenGL 2.0}, {@link #GL_EXT_gpu_shader4 EXT_gpu_shader4}, {@link #GL_EXT_texture_array EXT_texture_array} and GLSL 1.30. Promoted to core in {@link GL40 OpenGL 4.0}.
	 */
	public final boolean GL_ARB_texture_query_lod;
	/** When true, {@link ARBTextureRectangle} is supported. */
	public final boolean GL_ARB_texture_rectangle;
	/** When true, {@link ARBTransformFeedbackOverflowQuery} is supported. */
	public final boolean GL_ARB_transform_feedback_overflow_query;
	/** When true, {@link ARBTransposeMatrix} is supported. */
	public final boolean GL_ARB_transpose_matrix;
	/** When true, {@link ARBVertexBlend} is supported. */
	public final boolean GL_ARB_vertex_blend;
	/** When true, {@link ARBVertexBufferObject} is supported. */
	public final boolean GL_ARB_vertex_buffer_object;
	/** When true, {@link ARBVertexProgram} is supported. */
	public final boolean GL_ARB_vertex_program;
	/** When true, {@link ARBVertexShader} is supported. */
	public final boolean GL_ARB_vertex_shader;
	/** When true, {@link ARBWindowPos} is supported. */
	public final boolean GL_ARB_window_pos;
	/** When true, the <a href="http://www.opengl.org/registry/specs/ATI/shader_texture_lod.txt">ATI_shader_texture_lod</a> extension is supported. */
	public final boolean GL_ATI_shader_texture_lod;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/EXT/shadow_funcs.txt">EXT_shadow_funcs</a> extension is supported.
	 * <p/>
	 * This extension generalizes the {@link #GL_ARB_shadow ARB_shadow} extension to support all eight binary texture comparison functions rather than just
	 * {@link GL11#GL_LEQUAL LEQUAL} and {@link GL11#GL_GEQUAL GEQUAL}.
	 * <p/>
	 * Requires {@link #GL_ARB_depth_texture ARB_depth_texture} and {@link #GL_ARB_shadow ARB_shadow}.
	 */
	public final boolean GL_EXT_shadow_funcs;
	/** When true, {@link KHRContextFlushControl} is supported. */
	public final boolean GL_KHR_context_flush_control;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/KHR/robust_buffer_access_behavior.txt">KHR_robust_buffer_access_behavior</a> extension is supported.
	 * <p/>
	 * This extension specifies the behavior of out-of-bounds buffer and array accesses. This is an improvement over the existing {@link #GL_KHR_robustness KHR_robustness}
	 * extension which states that the application should not crash, but that behavior is otherwise undefined. This extension specifies the access protection
	 * provided by the GL to ensure that out-of-bounds accesses cannot read from or write to data not owned by the application. All accesses are contained
	 * within the buffer object and program area they reference. These additional robustness guarantees apply to contexts created with the robust access flag
	 * set.
	 * <p/>
	 * Requires {@link GL32 OpenGL 3.2} and {@link #GL_KHR_robustness KHR_robustness}.
	 */
	public final boolean GL_KHR_robust_buffer_access_behavior;
	/** When true, {@link KHRRobustness} is supported. */
	public final boolean GL_KHR_robustness;
	/** When true, the <a href="http://www.opengl.org/registry/specs/NV/blend_square.txt">NV_blend_square</a> extension is supported. */
	public final boolean GL_NV_blend_square;
	/** When true, the <a href="http://www.opengl.org/registry/specs/NV/fragment_program4.txt">NV_fragment_program4</a> extension is supported. */
	public final boolean GL_NV_fragment_program4;
	/** When true, the <a href="http://www.opengl.org/registry/specs/NV/fragment_program_option.txt">NV_fragment_program_option</a> extension is supported. */
	public final boolean GL_NV_fragment_program_option;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/NV/geometry_shader4.txt">NV_geometry_shader4</a> extension is supported.
	 * <p/>
	 * This extension builds upon the {@link #GL_EXT_geometry_shader4 EXT_geometry_shader4} specification to provide two additional capabilities:
	 * <ul>
	 * <li>Support for QUADS, QUAD_STRIP, and POLYGON primitive types when geometry shaders are enabled.  Such primitives will be tessellated into individual
	 * triangles.</li>
	 * <li>Setting the value of GEOMETRY_VERTICES_OUT_EXT will take effect immediately. It is not necessary to link the program object in order for this change
	 * to take effect, as is the case in the EXT version of this extension.</li>
	 * </ul>
	 * Requires {@link #GL_EXT_geometry_shader4 EXT_geometry_shader4}.
	 */
	public final boolean GL_NV_geometry_shader4;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/NV/parameter_buffer_object2.txt">NV_parameter_buffer_object2</a> extension is supported.
	 * <p/>
	 * This extension builds on the {@link #GL_NV_parameter_buffer_object NV_parameter_buffer_object} extension to provide additional flexibility in sourcing data from buffer objects.
	 * <p/>
	 * Requires {@link GL20 OpenGL 2.0}, {@link #GL_NV_gpu_program4 NV_gpu_program4} and {@link #GL_NV_parameter_buffer_object NV_parameter_buffer_object}.
	 */
	public final boolean GL_NV_parameter_buffer_object2;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/NV/shader_atomic_counters.txt">NV_shader_atomic_counters</a> extension is supported.
	 * <p/>
	 * This extension builds upon the {@link #GL_ARB_shader_atomic_counters ARB_shader_atomic_counters} and {@link #GL_NV_gpu_program5 NV_gpu_program5} extensions to provide assembly language support for
	 * incrementing, decrementing, and querying the values of atomic counters stored in buffer object memory.
	 * <p/>
	 * Requires {@link #GL_ARB_shader_atomic_counters ARB_shader_atomic_counters} and {@link #GL_NV_gpu_program5 NV_gpu_program5}.
	 */
	public final boolean GL_NV_shader_atomic_counters;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/NV/shader_atomic_float.txt">NV_shader_atomic_float</a> extension is supported.
	 * <p/>
	 * This extension provides GLSL built-in functions and assembly opcodes allowing shaders to perform atomic read-modify-write operations to buffer or
	 * texture memory with floating-point components.  The set of atomic operations provided by this extension is limited to adds and exchanges. Providing
	 * atomic add support allows shaders to atomically accumulate the sum of floating-point values into buffer or texture memory across multiple (possibly
	 * concurrent) shader invocations.
	 * <p/>
	 * This extension provides GLSL support for atomics targeting image uniforms (if GLSL 4.20, {@link #GL_ARB_shader_image_load_store ARB_shader_image_load_store}, or
	 * {@link #GL_EXT_shader_image_load_store EXT_shader_image_load_store} is supported) or floating-point pointers (if {@link #GL_NV_gpu_shader5 NV_gpu_shader5} is supported). Additionally, assembly opcodes
	 * for these operations is also provided if {@link #GL_NV_gpu_program5 NV_gpu_program5} is supported.
	 */
	public final boolean GL_NV_shader_atomic_float;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/NV/shader_storage_buffer_object.txt">NV_shader_storage_buffer_object</a> extension is supported.
	 * <p/>
	 * This extension provides assembly language support for shader storage buffers (from the {@link #GL_ARB_shader_storage_buffer_object ARB_shader_storage_buffer_object} extension) for all
	 * program types supported by {@link #GL_NV_gpu_program5 NV_gpu_program5}, including compute programs added by the {@link #GL_NV_compute_program5 NV_compute_program5} extension.
	 * <p/>
	 * Assembly programs using this extension can read and write to the memory of buffer objects bound to the binding points provided by
	 * {@link #GL_ARB_shader_storage_buffer_object ARB_shader_storage_buffer_object}.
	 */
	public final boolean GL_NV_shader_storage_buffer_object;
	/** When true, the <a href="http://www.opengl.org/registry/specs/NV/vertex_program1_1.txt">NV_vertex_program1_1</a> extension is supported. */
	public final boolean GL_NV_vertex_program1_1;
	/** When true, the <a href="http://www.opengl.org/registry/specs/NV/vertex_program2.txt">NV_vertex_program2</a> extension is supported. */
	public final boolean GL_NV_vertex_program2;
	/** When true, the <a href="http://www.opengl.org/registry/specs/NV/vertex_program4.txt">NV_vertex_program4</a> extension is supported. */
	public final boolean GL_NV_vertex_program4;
	/** When true, {@link WGLAMDGPUAssociation} is supported. */
	public final boolean WGL_AMD_gpu_association;
	/** When true, {@link WGLARBBufferRegion} is supported. */
	public final boolean WGL_ARB_buffer_region;
	/** When true, {@link WGLARBContextFlushControl} is supported. */
	public final boolean WGL_ARB_context_flush_control;
	/** When true, {@link WGLARBCreateContext} is supported. */
	public final boolean WGL_ARB_create_context;
	/** When true, {@link WGLARBCreateContextProfile} is supported. */
	public final boolean WGL_ARB_create_context_profile;
	/** When true, {@link WGLARBCreateContextRobustness} is supported. */
	public final boolean WGL_ARB_create_context_robustness;
	/** When true, {@link WGLARBExtensionsString} is supported. */
	public final boolean WGL_ARB_extensions_string;
	/** When true, {@link WGLARBFramebufferSRGB} is supported. */
	public final boolean WGL_ARB_framebuffer_sRGB;
	/** When true, {@link WGLARBMakeCurrentRead} is supported. */
	public final boolean WGL_ARB_make_current_read;
	/** When true, {@link WGLARBMultisample} is supported. */
	public final boolean WGL_ARB_multisample;
	/** When true, {@link WGLARBPbuffer} is supported. */
	public final boolean WGL_ARB_pbuffer;
	/** When true, {@link WGLARBPixelFormat} is supported. */
	public final boolean WGL_ARB_pixel_format;
	/** When true, {@link WGLARBPixelFormatFloat} is supported. */
	public final boolean WGL_ARB_pixel_format_float;
	/** When true, {@link WGLARBRenderTexture} is supported. */
	public final boolean WGL_ARB_render_texture;
	/** When true, {@link WGLARBRobustnessApplicationIsolation} is supported. */
	public final boolean WGL_ARB_robustness_application_isolation;
	/** When true, {@link WGLARBRobustnessShareGroupIsolation} is supported. */
	public final boolean WGL_ARB_robustness_share_group_isolation;
	/** When true, {@link WGLEXTCreateContextESProfile} is supported. */
	public final boolean WGL_EXT_create_context_es_profile;
	/** When true, {@link WGLEXTExtensionsString} is supported. */
	public final boolean WGL_EXT_extensions_string;
	/** When true, {@link WGLEXTFramebufferSRGB} is supported. */
	public final boolean WGL_EXT_framebuffer_sRGB;
	/** When true, {@link WGLEXTPixelFormatPackedFloat} is supported. */
	public final boolean WGL_EXT_pixel_format_packed_float;
	/** When true, {@link WGLEXTSwapControl} is supported. */
	public final boolean WGL_EXT_swap_control;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/EXT/wgl_swap_control_tear.txt">WGL_EXT_swap_control_tear</a> extension is supported.
	 * <p/>
	 * This extension extends the existing {@link #WGL_EXT_swap_control} extension by allowing a negative {@code interval} parameter to
	 * {@link WGLEXTSwapControl#wglSwapIntervalEXT}. The negative {@code interval} allows late swaps to occur without synchronization to the video frame. This
	 * reduces the visual stutter on late frames and reduces the stall on subsequent frames.
	 */
	public final boolean WGL_EXT_swap_control_tear;
	/** When true, {@link WGLNVCopyImage} is supported. */
	public final boolean WGL_NV_copy_image;
	/** When true, {@link WGLNVDelayBeforeSwap} is supported. */
	public final boolean WGL_NV_delay_before_swap;
	/** When true, {@link WGLNVDXInterop} is supported. */
	public final boolean WGL_NV_DX_interop;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/NV/DX_interop2.txt">WGL_NV_DX_interop2</a> extension is supported.
	 * <p/>
	 * This extension expands on the specification of {@link #WGL_NV_DX_interop} to add support for DirectX version 10, 10.1 and 11 resources.
	 * <p/>
	 * Requires {@link GL20 OpenGL 2.0} and {@link #WGL_NV_DX_interop}
	 */
	public final boolean WGL_NV_DX_interop2;
	/** When true, {@link WGLNVGPUAffinity} is supported. */
	public final boolean WGL_NV_gpu_affinity;

	ContextCapabilities(FunctionProvider provider, Set<String> ext, boolean fc) {
		OpenGL11 = (__GL11 = GL11.create(ext, provider, fc)) != null;
		OpenGL12 = (__GL12 = GL12.create(ext, provider)) != null;
		OpenGL13 = (__GL13 = GL13.create(ext, provider, fc)) != null;
		OpenGL14 = (__GL14 = GL14.create(ext, provider, fc)) != null;
		OpenGL15 = (__GL15 = GL15.create(ext, provider)) != null;
		OpenGL20 = (__GL20 = GL20.create(ext, provider)) != null;
		OpenGL21 = (__GL21 = GL21.create(ext, provider)) != null;
		OpenGL30 = (__GL30 = GL30.create(ext, provider)) != null;
		OpenGL31 = (__GL31 = GL31.create(ext, provider)) != null;
		OpenGL32 = (__GL32 = GL32.create(ext, provider)) != null;
		OpenGL33 = (__GL33 = GL33.create(ext, provider, fc)) != null;
		OpenGL40 = (__GL40 = GL40.create(ext, provider)) != null;
		OpenGL41 = (__GL41 = GL41.create(ext, provider)) != null;
		OpenGL42 = (__GL42 = GL42.create(ext, provider)) != null;
		OpenGL43 = (__GL43 = GL43.create(ext, provider)) != null;
		OpenGL44 = (__GL44 = GL44.create(ext, provider)) != null;
		OpenGL45 = (__GL45 = GL45.create(ext, provider)) != null;
		GLX_11 = (__GLX11 = GLX11.create(ext, provider)) != null;
		GLX_12 = (__GLX12 = GLX12.create(ext, provider)) != null;
		GLX_13 = (__GLX13 = GLX13.create(ext, provider)) != null;
		GLX_14 = (__GLX14 = GLX14.create(ext, provider)) != null;
		GLX_AMD_gpu_association = (__GLXAMDGPUAssociation = GLXAMDGPUAssociation.create(ext, provider)) != null;
		GLX_ARB_context_flush_control = ext.contains("GLX_ARB_context_flush_control");
		GLX_ARB_create_context = (__GLXARBCreateContext = GLXARBCreateContext.create(ext, provider)) != null;
		GLX_ARB_create_context_profile = ext.contains("GLX_ARB_create_context_profile");
		GLX_ARB_create_context_robustness = ext.contains("GLX_ARB_create_context_robustness");
		GLX_ARB_fbconfig_float = ext.contains("GLX_ARB_fbconfig_float");
		GLX_ARB_framebuffer_sRGB = ext.contains("GLX_ARB_framebuffer_sRGB");
		GLX_ARB_get_proc_address = (__GLXARBGetProcAddress = GLXARBGetProcAddress.create(ext, provider)) != null;
		GLX_ARB_multisample = ext.contains("GLX_ARB_multisample");
		GLX_ARB_robustness_application_isolation = ext.contains("GLX_ARB_robustness_application_isolation");
		GLX_ARB_robustness_share_group_isolation = ext.contains("GLX_ARB_robustness_share_group_isolation");
		GLX_ARB_vertex_buffer_object = ext.contains("GLX_ARB_vertex_buffer_object");
		GLX_EXT_buffer_age = ext.contains("GLX_EXT_buffer_age");
		GLX_EXT_create_context_es_profile = ext.contains("GLX_EXT_create_context_es_profile");
		GLX_EXT_fbconfig_packed_float = ext.contains("GLX_EXT_fbconfig_packed_float");
		GLX_EXT_framebuffer_sRGB = ext.contains("GLX_EXT_framebuffer_sRGB");
		GLX_EXT_import_context = (__GLXEXTImportContext = GLXEXTImportContext.create(ext, provider)) != null;
		GLX_EXT_swap_control = (__GLXEXTSwapControl = GLXEXTSwapControl.create(ext, provider)) != null;
		GLX_EXT_swap_control_tear = ext.contains("GLX_EXT_swap_control_tear");
		GLX_EXT_texture_from_pixmap = (__GLXEXTTextureFromPixmap = GLXEXTTextureFromPixmap.create(ext, provider)) != null;
		GLX_EXT_visual_info = ext.contains("GLX_EXT_visual_info");
		GLX_EXT_visual_rating = ext.contains("GLX_EXT_visual_rating");
		GLX_INTEL_swap_event = ext.contains("GLX_INTEL_swap_event");
		GLX_NV_copy_image = (__GLXNVCopyImage = GLXNVCopyImage.create(ext, provider)) != null;
		GLX_NV_delay_before_swap = (__GLXNVDelayBeforeSwap = GLXNVDelayBeforeSwap.create(ext, provider)) != null;
		GLX_SGI_make_current_read = (__GLXSGIMakeCurrentRead = GLXSGIMakeCurrentRead.create(ext, provider)) != null;
		GLX_SGI_swap_control = (__GLXSGISwapControl = GLXSGISwapControl.create(ext, provider)) != null;
		GLX_SGI_video_sync = (__GLXSGIVideoSync = GLXSGIVideoSync.create(ext, provider)) != null;
		GLX_SGIX_fbconfig = (__GLXSGIXFBConfig = GLXSGIXFBConfig.create(ext, provider)) != null;
		GLX_SGIX_pbuffer = (__GLXSGIXPBuffer = GLXSGIXPBuffer.create(ext, provider)) != null;
		GLX_SGIX_swap_barrier = (__GLXSGIXSwapBarrier = GLXSGIXSwapBarrier.create(ext, provider)) != null;
		GLX_SGIX_swap_group = (__GLXSGIXSwapGroup = GLXSGIXSwapGroup.create(ext, provider)) != null;
		GL_AMD_conservative_depth = ext.contains("GL_AMD_conservative_depth");
		GL_AMD_debug_output = (__AMDDebugOutput = AMDDebugOutput.create(ext, provider)) != null;
		GL_AMD_occlusion_query_event = (__AMDOcclusionQueryEvent = AMDOcclusionQueryEvent.create(ext, provider)) != null;
		GL_AMD_shader_stencil_export = ext.contains("GL_AMD_shader_stencil_export");
		GL_AMD_shader_trinary_minmax = ext.contains("GL_AMD_shader_trinary_minmax");
		GL_AMD_texture_texture4 = ext.contains("GL_AMD_texture_texture4");
		GL_AMD_transform_feedback3_lines_triangles = ext.contains("GL_AMD_transform_feedback3_lines_triangles");
		GL_AMD_vertex_shader_layer = ext.contains("GL_AMD_vertex_shader_layer");
		GL_AMD_vertex_shader_viewport_index = ext.contains("GL_AMD_vertex_shader_viewport_index");
		GL_ARB_arrays_of_arrays = ext.contains("GL_ARB_arrays_of_arrays");
		GL_ARB_buffer_storage = (__ARBBufferStorage = ARBBufferStorage.create(ext, provider)) != null;
		GL_ARB_cl_event = (__ARBCLEvent = ARBCLEvent.create(ext, provider)) != null;
		GL_ARB_clear_texture = (__ARBClearTexture = ARBClearTexture.create(ext, provider)) != null;
		GL_ARB_clip_control = (__ARBClipControl = ARBClipControl.create(ext, provider)) != null;
		GL_ARB_color_buffer_float = (__ARBColorBufferFloat = ARBColorBufferFloat.create(ext, provider)) != null;
		GL_ARB_compatibility = ext.contains("GL_ARB_compatibility");
		GL_ARB_conditional_render_inverted = ext.contains("GL_ARB_conditional_render_inverted");
		GL_ARB_conservative_depth = ext.contains("GL_ARB_conservative_depth");
		GL_ARB_copy_buffer = (__ARBCopyBuffer = ARBCopyBuffer.create(ext, provider)) != null;
		GL_ARB_cull_distance = ext.contains("GL_ARB_cull_distance");
		GL_ARB_depth_buffer_float = ext.contains("GL_ARB_depth_buffer_float");
		GL_ARB_depth_texture = ext.contains("GL_ARB_depth_texture");
		GL_ARB_derivative_control = ext.contains("GL_ARB_derivative_control");
		GL_ARB_direct_state_access = (__ARBDirectStateAccess = ARBDirectStateAccess.create(ext, provider)) != null;
		GL_ARB_draw_buffers = (__ARBDrawBuffers = ARBDrawBuffers.create(ext, provider)) != null;
		GL_ARB_draw_buffers_blend = (__ARBDrawBuffersBlend = ARBDrawBuffersBlend.create(ext, provider)) != null;
		GL_ARB_enhanced_layouts = ext.contains("GL_ARB_enhanced_layouts");
		GL_ARB_ES3_1_compatibility = (__ARBES31Compatibility = ARBES31Compatibility.create(ext, provider)) != null;
		GL_ARB_explicit_attrib_location = ext.contains("GL_ARB_explicit_attrib_location");
		GL_ARB_fragment_coord_conventions = ext.contains("GL_ARB_fragment_coord_conventions");
		GL_ARB_fragment_layer_viewport = ext.contains("GL_ARB_fragment_layer_viewport");
		GL_ARB_fragment_program = ext.contains("GL_ARB_fragment_program");
		GL_ARB_fragment_program_shadow = ext.contains("GL_ARB_fragment_program_shadow");
		GL_ARB_fragment_shader = ext.contains("GL_ARB_fragment_shader");
		GL_ARB_get_texture_sub_image = (__ARBGetTextureSubImage = ARBGetTextureSubImage.create(ext, provider)) != null;
		GL_ARB_half_float_pixel = ext.contains("GL_ARB_half_float_pixel");
		GL_ARB_imaging = (__ARBImaging = ARBImaging.create(ext, provider, fc)) != null;
		GL_ARB_matrix_palette = (__ARBMatrixPalette = ARBMatrixPalette.create(ext, provider)) != null;
		GL_ARB_multi_bind = (__ARBMultiBind = ARBMultiBind.create(ext, provider)) != null;
		GL_ARB_multisample = (__ARBMultisample = ARBMultisample.create(ext, provider)) != null;
		GL_ARB_multitexture = ext.contains("GL_ARB_multitexture");
		GL_ARB_occlusion_query = (__ARBOcclusionQuery = ARBOcclusionQuery.create(ext, provider)) != null;
		GL_ARB_pipeline_statistics_query = ext.contains("GL_ARB_pipeline_statistics_query");
		GL_ARB_pixel_buffer_object = ext.contains("GL_ARB_pixel_buffer_object");
		GL_ARB_point_parameters = (__ARBPointParameters = ARBPointParameters.create(ext, provider)) != null;
		GL_ARB_point_sprite = ext.contains("GL_ARB_point_sprite");
		GL_ARB_query_buffer_object = ext.contains("GL_ARB_query_buffer_object");
		GL_ARB_robust_buffer_access_behavior = ext.contains("GL_ARB_robust_buffer_access_behavior");
		GL_ARB_robustness_isolation = ext.contains("GL_ARB_robustness_isolation");
		GL_ARB_shader_bit_encoding = ext.contains("GL_ARB_shader_bit_encoding");
		GL_ARB_shader_image_size = ext.contains("GL_ARB_shader_image_size");
		GL_ARB_shader_objects = (__ARBShaderObjects = ARBShaderObjects.create(ext, provider)) != null;
		GL_ARB_shader_precision = ext.contains("GL_ARB_shader_precision");
		GL_ARB_shader_stencil_export = ext.contains("GL_ARB_shader_stencil_export");
		GL_ARB_shader_texture_image_samples = ext.contains("GL_ARB_shader_texture_image_samples");
		GL_ARB_shader_texture_lod = ext.contains("GL_ARB_shader_texture_lod");
		GL_ARB_shading_language_100 = ext.contains("GL_ARB_shading_language_100");
		GL_ARB_shading_language_420pack = ext.contains("GL_ARB_shading_language_420pack");
		GL_ARB_shading_language_packing = ext.contains("GL_ARB_shading_language_packing");
		GL_ARB_shadow = ext.contains("GL_ARB_shadow");
		GL_ARB_shadow_ambient = ext.contains("GL_ARB_shadow_ambient");
		GL_ARB_sparse_buffer = (__ARBSparseBuffer = ARBSparseBuffer.create(ext, provider)) != null;
		GL_ARB_sync = (__ARBSync = ARBSync.create(ext, provider)) != null;
		GL_ARB_texture_barrier = (__ARBTextureBarrier = ARBTextureBarrier.create(ext, provider)) != null;
		GL_ARB_texture_border_clamp = ext.contains("GL_ARB_texture_border_clamp");
		GL_ARB_texture_buffer_object_rgb32 = ext.contains("GL_ARB_texture_buffer_object_rgb32");
		GL_ARB_texture_compression = (__ARBTextureCompression = ARBTextureCompression.create(ext, provider)) != null;
		GL_ARB_texture_cube_map = ext.contains("GL_ARB_texture_cube_map");
		GL_ARB_texture_env_add = ext.contains("GL_ARB_texture_env_add");
		GL_ARB_texture_env_combine = ext.contains("GL_ARB_texture_env_combine");
		GL_ARB_texture_env_crossbar = ext.contains("GL_ARB_texture_env_crossbar");
		GL_ARB_texture_env_dot3 = ext.contains("GL_ARB_texture_env_dot3");
		GL_ARB_texture_float = ext.contains("GL_ARB_texture_float");
		GL_ARB_texture_mirror_clamp_to_edge = ext.contains("GL_ARB_texture_mirror_clamp_to_edge");
		GL_ARB_texture_mirrored_repeat = ext.contains("GL_ARB_texture_mirrored_repeat");
		GL_ARB_texture_non_power_of_two = ext.contains("GL_ARB_texture_non_power_of_two");
		GL_ARB_texture_query_levels = ext.contains("GL_ARB_texture_query_levels");
		GL_ARB_texture_query_lod = ext.contains("GL_ARB_texture_query_lod");
		GL_ARB_texture_rectangle = ext.contains("GL_ARB_texture_rectangle");
		GL_ARB_transform_feedback_overflow_query = ext.contains("GL_ARB_transform_feedback_overflow_query");
		GL_ARB_transpose_matrix = (__ARBTransposeMatrix = ARBTransposeMatrix.create(ext, provider)) != null;
		GL_ARB_vertex_blend = (__ARBVertexBlend = ARBVertexBlend.create(ext, provider)) != null;
		GL_ARB_vertex_buffer_object = (__ARBVertexBufferObject = ARBVertexBufferObject.create(ext, provider)) != null;
		GL_ARB_vertex_program = (__ARBVertexProgram = ARBVertexProgram.create(ext, provider)) != null;
		GL_ARB_vertex_shader = (__ARBVertexShader = ARBVertexShader.create(ext, provider)) != null;
		GL_ARB_window_pos = (__ARBWindowPos = ARBWindowPos.create(ext, provider)) != null;
		GL_ATI_shader_texture_lod = ext.contains("GL_ATI_shader_texture_lod");
		GL_EXT_shadow_funcs = ext.contains("GL_EXT_shadow_funcs");
		GL_KHR_context_flush_control = ext.contains("GL_KHR_context_flush_control");
		GL_KHR_robust_buffer_access_behavior = ext.contains("GL_KHR_robust_buffer_access_behavior");
		GL_KHR_robustness = (__KHRRobustness = KHRRobustness.create(ext, provider)) != null;
		GL_NV_blend_square = ext.contains("GL_NV_blend_square");
		GL_NV_fragment_program4 = ext.contains("GL_NV_fragment_program4");
		GL_NV_fragment_program_option = ext.contains("GL_NV_fragment_program_option");
		GL_NV_geometry_shader4 = ext.contains("GL_NV_geometry_shader4");
		GL_NV_parameter_buffer_object2 = ext.contains("GL_NV_parameter_buffer_object2");
		GL_NV_shader_atomic_counters = ext.contains("GL_NV_shader_atomic_counters");
		GL_NV_shader_atomic_float = ext.contains("GL_NV_shader_atomic_float");
		GL_NV_shader_storage_buffer_object = ext.contains("GL_NV_shader_storage_buffer_object");
		GL_NV_vertex_program1_1 = ext.contains("GL_NV_vertex_program1_1");
		GL_NV_vertex_program2 = ext.contains("GL_NV_vertex_program2");
		GL_NV_vertex_program4 = ext.contains("GL_NV_vertex_program4");
		WGL_AMD_gpu_association = (__WGLAMDGPUAssociation = WGLAMDGPUAssociation.create(ext, provider)) != null;
		WGL_ARB_buffer_region = (__WGLARBBufferRegion = WGLARBBufferRegion.create(ext, provider)) != null;
		WGL_ARB_context_flush_control = ext.contains("WGL_ARB_context_flush_control");
		WGL_ARB_create_context = (__WGLARBCreateContext = WGLARBCreateContext.create(ext, provider)) != null;
		WGL_ARB_create_context_profile = ext.contains("WGL_ARB_create_context_profile");
		WGL_ARB_create_context_robustness = ext.contains("WGL_ARB_create_context_robustness");
		WGL_ARB_extensions_string = (__WGLARBExtensionsString = WGLARBExtensionsString.create(ext, provider)) != null;
		WGL_ARB_framebuffer_sRGB = ext.contains("WGL_ARB_framebuffer_sRGB");
		WGL_ARB_make_current_read = (__WGLARBMakeCurrentRead = WGLARBMakeCurrentRead.create(ext, provider)) != null;
		WGL_ARB_multisample = ext.contains("WGL_ARB_multisample");
		WGL_ARB_pbuffer = (__WGLARBPbuffer = WGLARBPbuffer.create(ext, provider)) != null;
		WGL_ARB_pixel_format = (__WGLARBPixelFormat = WGLARBPixelFormat.create(ext, provider)) != null;
		WGL_ARB_pixel_format_float = ext.contains("WGL_ARB_pixel_format_float");
		WGL_ARB_render_texture = (__WGLARBRenderTexture = WGLARBRenderTexture.create(ext, provider)) != null;
		WGL_ARB_robustness_application_isolation = ext.contains("WGL_ARB_robustness_application_isolation");
		WGL_ARB_robustness_share_group_isolation = ext.contains("WGL_ARB_robustness_share_group_isolation");
		WGL_EXT_create_context_es_profile = ext.contains("WGL_EXT_create_context_es_profile");
		WGL_EXT_extensions_string = (__WGLEXTExtensionsString = WGLEXTExtensionsString.create(ext, provider)) != null;
		WGL_EXT_framebuffer_sRGB = ext.contains("WGL_EXT_framebuffer_sRGB");
		WGL_EXT_pixel_format_packed_float = ext.contains("WGL_EXT_pixel_format_packed_float");
		WGL_EXT_swap_control = (__WGLEXTSwapControl = WGLEXTSwapControl.create(ext, provider)) != null;
		WGL_EXT_swap_control_tear = ext.contains("WGL_EXT_swap_control_tear");
		WGL_NV_copy_image = (__WGLNVCopyImage = WGLNVCopyImage.create(ext, provider)) != null;
		WGL_NV_delay_before_swap = (__WGLNVDelayBeforeSwap = WGLNVDelayBeforeSwap.create(ext, provider)) != null;
		WGL_NV_DX_interop = (__WGLNVDXInterop = WGLNVDXInterop.create(ext, provider)) != null;
		WGL_NV_DX_interop2 = ext.contains("WGL_NV_DX_interop2");
		WGL_NV_gpu_affinity = (__WGLNVGPUAffinity = WGLNVGPUAffinity.create(ext, provider)) != null;
	}
}