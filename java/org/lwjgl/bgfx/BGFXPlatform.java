/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to the C platform API of the <a href="https://github.com/bkaradzic/bgfx">bgfx</a> library. */
public class BGFXPlatform {

	/** Render frame. ({@code bgfx_renderer_frame_t}) */
	public static final int
		BGFX_RENDER_FRAME_NO_CONTEXT = 0,
		BGFX_RENDER_FRAME_RENDER     = 1,
		BGFX_RENDER_FRAME_EXITING    = 2,
		BGFX_RENDER_FRAME_COUNT      = 3;

	protected BGFXPlatform() {
		throw new UnsupportedOperationException();
	}

	/** Contains the function pointers loaded from {@code BGFX.getLibrary()}. */
	public static final class Functions {

		private Functions() {}

		/** Function address. */
		public static final long
			render_frame                  = apiGetFunctionAddress(BGFX.getLibrary(), "bgfx_render_frame"),
			set_platform_data             = apiGetFunctionAddress(BGFX.getLibrary(), "bgfx_set_platform_data"),
			get_internal_data             = apiGetFunctionAddress(BGFX.getLibrary(), "bgfx_get_internal_data"),
			override_internal_texture_ptr = apiGetFunctionAddress(BGFX.getLibrary(), "bgfx_override_internal_texture_ptr"),
			override_internal_texture     = apiGetFunctionAddress(BGFX.getLibrary(), "bgfx_override_internal_texture");

	}

	// --- [ bgfx_render_frame ] ---

	/**
	 * Render frame.
	 * 
	 * <p>This call should be only used on platforms that don't allow creating separate rendering thread. If it is called before to {@link BGFX#bgfx_init init}, render thread won't
	 * be created by {@link BGFX#bgfx_init init} call.</p>
	 */
	public static int bgfx_render_frame() {
		long __functionAddress = Functions.render_frame;
		return invokeI(__functionAddress);
	}

	// --- [ bgfx_set_platform_data ] ---

	/**
	 * Sets platform data.
	 * 
	 * <p>Must be called before {@link BGFX#bgfx_init init}.</p>
	 *
	 * @param _data the platform data to set
	 */
	public static void nbgfx_set_platform_data(long _data) {
		long __functionAddress = Functions.set_platform_data;
		invokePV(__functionAddress, _data);
	}

	/**
	 * Sets platform data.
	 * 
	 * <p>Must be called before {@link BGFX#bgfx_init init}.</p>
	 *
	 * @param _data the platform data to set
	 */
	public static void bgfx_set_platform_data(BGFXPlatformData _data) {
		nbgfx_set_platform_data(_data.address());
	}

	// --- [ bgfx_get_internal_data ] ---

	/** Gets internal data for interop. */
	public static long nbgfx_get_internal_data() {
		long __functionAddress = Functions.get_internal_data;
		return invokeP(__functionAddress);
	}

	/** Gets internal data for interop. */
	public static BGFXInternalData bgfx_get_internal_data() {
		long __result = nbgfx_get_internal_data();
		return BGFXInternalData.create(__result);
	}

	// --- [ bgfx_override_internal_texture_ptr ] ---

	/**
	 * Overrides internal texture with externally created texture. Previously created internal texture will released.
	 * 
	 * <p>It's expected you understand some bgfx internals before you use this call.</p>
	 * 
	 * <p>Must be called only on render thread.</p>
	 *
	 * @param _handle texture handle
	 * @param _ptr    native API pointer to texture
	 *
	 * @return native API pointer to texture. If result is 0, texture is not created yet from the main thread.
	 */
	public static long bgfx_override_internal_texture_ptr(short _handle, long _ptr) {
		long __functionAddress = Functions.override_internal_texture_ptr;
		return invokePP(__functionAddress, _handle, _ptr);
	}

	// --- [ bgfx_override_internal_texture ] ---

	/**
	 * Overrides internal texture by creating new texture. Previously created internal texture will released.
	 * 
	 * <p>It's expected you understand some bgfx internals before you use this call.</p>
	 * 
	 * <p>Must be called only on render thread.</p>
	 *
	 * @param _handle  texture handle
	 * @param _width   width
	 * @param _height  height
	 * @param _numMips number of mip-maps
	 * @param _format  texture format
	 * @param _flags   default texture sampling mode is linear, and wrap mode is repeat
	 *
	 * @return native API pointer to texture. If result is 0, texture is not created yet from the main thread.
	 */
	public static long nbgfx_override_internal_texture(short _handle, short _width, short _height, byte _numMips, int _format, int _flags) {
		long __functionAddress = Functions.override_internal_texture;
		return invokeP(__functionAddress, _handle, _width, _height, _numMips, _format, _flags);
	}

	/**
	 * Overrides internal texture by creating new texture. Previously created internal texture will released.
	 * 
	 * <p>It's expected you understand some bgfx internals before you use this call.</p>
	 * 
	 * <p>Must be called only on render thread.</p>
	 *
	 * @param _handle  texture handle
	 * @param _width   width
	 * @param _height  height
	 * @param _numMips number of mip-maps
	 * @param _format  texture format
	 * @param _flags   default texture sampling mode is linear, and wrap mode is repeat
	 *
	 * @return native API pointer to texture. If result is 0, texture is not created yet from the main thread.
	 */
	public static long bgfx_override_internal_texture(short _handle, int _width, int _height, int _numMips, int _format, int _flags) {
		return nbgfx_override_internal_texture(_handle, (short)_width, (short)_height, (byte)_numMips, _format, _flags);
	}

}